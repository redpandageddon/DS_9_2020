using RSMK2;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Runtime.Remoting.Channels;
using System.Runtime.Remoting.Channels.Tcp;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace RCMK2
{
    public partial class ProviderForm : Form
    {
        public ProviderForm()
        {
            InitializeComponent();
            listView1.View = View.Details;
            listView1.Columns.Add("№", 40, HorizontalAlignment.Left);
            listView1.Columns.Add("Месяцев сотрудничества", 100, HorizontalAlignment.Left);
            listView1.Columns.Add("Поставщик", 100, HorizontalAlignment.Left);
            listView1.Columns.Add("Материал", 100, HorizontalAlignment.Left);
        }

        private void Output(List<Provider> lst)
        {
            listView1.Items.Clear();
            int i = 1;
            foreach (var provider in lst)
            {
                ListViewItem newItem = new ListViewItem(i.ToString());
                listView1.Items.Add(newItem);
                newItem.SubItems.Add(provider.GetCooperation().ToString());
                newItem.SubItems.Add(provider.GetName());
                newItem.SubItems.Add(provider.GetMaterial());
                i++;
            }
        }

        ProviderOperation providerOperation = null;

        private void button1_Click(object sender, EventArgs e)
        {
            try
            {
                Output(providerOperation.Add(new Provider(int.Parse(textBox1.Text), textBox2.Text, textBox3.Text)));
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void ProviderForm_Load(object sender, EventArgs e)
        {
            try
            {
                TcpClientChannel chan = new TcpClientChannel();
                ChannelServices.RegisterChannel(chan, false);
                providerOperation = (ProviderOperation)Activator.GetObject(
                typeof(ProviderOperation), "tcp://localhost:9000/provider");
                Output(providerOperation.GetAll());

            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            if (listView1.SelectedIndices.Count < 1)
            {
                MessageBox.Show(this, "Выберите элемент для удаления!", "Сообщение об ошибке", MessageBoxButtons.OK, MessageBoxIcon.Error);
                return;
            }
            else
            {
                try
                {
                    providerOperation.DeleteAt(listView1.SelectedIndices[0]);
                    Output(providerOperation.GetAll());
                }
                catch (Exception ex)
                {
                    MessageBox.Show(ex.Message);
                }
            }
        }
    }
}

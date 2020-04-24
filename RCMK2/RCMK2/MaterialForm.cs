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
    public partial class MaterialForm : Form
    {
        public MaterialForm()
        {
            InitializeComponent();
            listView1.View = View.Details;
            listView1.Columns.Add("№", 40, HorizontalAlignment.Left);
            listView1.Columns.Add("Материал", 100, HorizontalAlignment.Left);
            listView1.Columns.Add("Описание", 150, HorizontalAlignment.Left);
            listView1.Columns.Add("Цена", 100, HorizontalAlignment.Left);
            listView1.Columns.Add("Количество", 80, HorizontalAlignment.Left);
        }

        private void Output(List<Material> lst)
        {
            listView1.Items.Clear();
            int i = 1;
            foreach (var act in lst)
            {
                ListViewItem newItem = new ListViewItem(i.ToString());
                listView1.Items.Add(newItem);
                newItem.SubItems.Add(act.GetName());
                newItem.SubItems.Add(act.GetDescription());
                newItem.SubItems.Add(act.GetPrice().ToString());
                newItem.SubItems.Add(act.GetAmount().ToString());
                i++;
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            try
            {
                Output(materialOperation.Add(new Material(textBox1.Text, textBox2.Text, double.Parse(textBox3.Text), int.Parse(textBox4.Text))));
                label5.Text = materialOperation.CountTotal().ToString();
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
                    materialOperation.DeleteAt(listView1.SelectedIndices[0]);
                    Output(materialOperation.GetAll());
                    label5.Text = materialOperation.CountTotal().ToString();
                }
                catch (Exception ex)
                {
                    MessageBox.Show(ex.Message);
                }
            }
        }

        MaterialOperation materialOperation = null;

        private void MaterialForm_Load(object sender, EventArgs e)
        {
            try
            {
                TcpClientChannel chan = new TcpClientChannel();
                ChannelServices.RegisterChannel(chan, false);
                materialOperation = (MaterialOperation)Activator.GetObject(
                typeof(MaterialOperation), "tcp://localhost:9000/material");
                Output(materialOperation.GetAll());
                label5.Text = materialOperation.CountTotal().ToString();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }
    }
}

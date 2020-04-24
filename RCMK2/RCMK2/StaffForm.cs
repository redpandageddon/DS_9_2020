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
    public partial class StaffForm : Form
    {
        public StaffForm()
        {
            InitializeComponent();
            listView1.View = View.Details;
            listView1.Columns.Add("№", 40, HorizontalAlignment.Left);
            listView1.Columns.Add("ФИО", 100, HorizontalAlignment.Left);
            listView1.Columns.Add("Возраст", 50, HorizontalAlignment.Left);
            listView1.Columns.Add("Должность", 100, HorizontalAlignment.Left);
            listView1.Columns.Add("ЗП", 80, HorizontalAlignment.Left);
        }

        private void Output(List<Staff> lst)
        {
            listView1.Items.Clear();
            int i = 1;
            foreach (var act in lst)
            {
                ListViewItem newItem = new ListViewItem(i.ToString());
                listView1.Items.Add(newItem);
                newItem.SubItems.Add(act.GetFIO());
                newItem.SubItems.Add(act.GetAge().ToString());
                newItem.SubItems.Add(act.GetPosition());
                newItem.SubItems.Add(act.GetSalary().ToString());
                i++;
            }
        }

        StaffOperation staffOperation = null;

        private void StaffForm_Load(object sender, EventArgs e)
        {
            try
            {
                TcpClientChannel chan = new TcpClientChannel();
                ChannelServices.RegisterChannel(chan, false);
                staffOperation = (StaffOperation)Activator.GetObject(
                typeof(StaffOperation), "tcp://localhost:9000/staff");
                Output(staffOperation.GetAll());
                label5.Text = staffOperation.CountTotal().ToString();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            try
            {
                Output(staffOperation.Add(new Staff(textBox1.Text, int.Parse(textBox2.Text), textBox3.Text, double.Parse(textBox4.Text))));
                label5.Text = staffOperation.CountTotal().ToString();
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
                    staffOperation.DeleteAt(listView1.SelectedIndices[0]);
                    Output(staffOperation.GetAll());
                    label5.Text = staffOperation.CountTotal().ToString();
                }
                catch (Exception ex)
                {
                    MessageBox.Show(ex.Message);
                }
            }
        }
    }
}

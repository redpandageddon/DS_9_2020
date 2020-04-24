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
using RSMK2;

namespace RCMK2
{
    public partial class ActionForm : Form
    {
        public ActionForm()
        {
            InitializeComponent();
            listView1.View = View.Details;
            listView1.Columns.Add("№", 40, HorizontalAlignment.Left);
            listView1.Columns.Add("Название", 100, HorizontalAlignment.Left);
            listView1.Columns.Add("Цена", 100, HorizontalAlignment.Left);
            listView1.Columns.Add("Время", 100, HorizontalAlignment.Left);
            listView1.Columns.Add("Веник", 100, HorizontalAlignment.Left);
        }

        private void Output(List<RSMK2.Action> lst)
        {
            listView1.Items.Clear();
            int i = 1;
            foreach (var act in lst)
            {
                ListViewItem newItem = new ListViewItem(i.ToString());
                listView1.Items.Add(newItem);
                newItem.SubItems.Add(act.GetName());
                newItem.SubItems.Add(act.GetPrice().ToString());
                newItem.SubItems.Add(act.GetTime().ToString());
                newItem.SubItems.Add(act.GetBranch());
                i++;
            }
        }

        private void ActionForm_Load(object sender, EventArgs e)
        {
            try
            {
                TcpClientChannel chan = new TcpClientChannel();
                ChannelServices.RegisterChannel(chan, false);
                actionOperation = (ActionOperation)Activator.GetObject(
                typeof(ActionOperation), "tcp://localhost:9000/action");
                Output(actionOperation.GetAll());
                label5.Text = actionOperation.CountTotal().ToString();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        ActionOperation actionOperation = null;

        private void button1_Click(object sender, EventArgs e)
        {
            try
            {
                Output(actionOperation.Add(new RSMK2.Action(textBox1.Text, double.Parse(textBox2.Text), double.Parse(textBox3.Text), textBox4.Text)));
                label5.Text = actionOperation.CountTotal().ToString();
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
                    actionOperation.DeleteAt(listView1.SelectedIndices[0]);
                    Output(actionOperation.GetAll());
                    label5.Text = actionOperation.CountTotal().ToString();
                }
                catch (Exception ex)
                {
                    MessageBox.Show(ex.Message);
                }
            }
        }
    }
}

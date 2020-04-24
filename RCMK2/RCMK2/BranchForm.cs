using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Runtime.Remoting;
using System.Runtime.Remoting.Channels;
using System.Runtime.Remoting.Channels.Tcp;
using RSMK2;


namespace RCMK2
{
    public partial class BranchForm : Form
    {
        public BranchForm()
        {
            InitializeComponent();
            listView1.View = View.Details;
            listView1.Columns.Add("№", 40, HorizontalAlignment.Left);
            listView1.Columns.Add("Дерево", 100, HorizontalAlignment.Left);
            listView1.Columns.Add("Описание", 100, HorizontalAlignment.Left);
        }

        private void Output(List<Branch> lst)
        {
            listView1.Items.Clear();
            int i = 1;
            foreach (Branch branch in lst)
            {
                ListViewItem newItem = new ListViewItem(i.ToString());
                listView1.Items.Add(newItem);
                newItem.SubItems.Add(branch.GetTree());
                newItem.SubItems.Add(branch.GetDescription());
                i++;
            }
        }

        BranchOperation branchOperation = null;

        private void BranchForm_Load(object sender, EventArgs e)
        {
            try
            {
                TcpClientChannel chan = new TcpClientChannel();
                ChannelServices.RegisterChannel(chan, false);
                branchOperation = (BranchOperation)Activator.GetObject(
                typeof(BranchOperation), "tcp://localhost:9000/branch");
                Output(branchOperation.GetAll());

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
                Output(branchOperation.Add(new Branch(textBox1.Text, textBox2.Text)));
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
                    branchOperation.DeleteAt(listView1.SelectedIndices[0]);
                    Output(branchOperation.GetAll());
                }
                catch (Exception ex)
                {
                    MessageBox.Show(ex.Message);
                }
            }
        }

    }
}

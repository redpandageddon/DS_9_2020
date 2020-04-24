using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace RCMK2
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            BranchForm form = new BranchForm();
            form.Show();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            ActionForm form = new ActionForm();
            form.Show();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            StaffForm form = new StaffForm();
            form.Show();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            ProviderForm form = new ProviderForm();
            form.Show();
        }

        private void button5_Click(object sender, EventArgs e)
        {
            MaterialForm form = new MaterialForm();
            form.Show();
        }
    }
}

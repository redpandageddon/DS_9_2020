using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace zwscsclient
{
    public partial class Main : Form
    {
        public Main()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            BranchForm form = new BranchForm();
            form.ShowDialog();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            ActionForm form = new ActionForm();
            form.ShowDialog();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            StaffForm form = new StaffForm();
            form.ShowDialog();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            ProviderForm form = new ProviderForm();
            form.ShowDialog();
        }

        private void button5_Click(object sender, EventArgs e)
        {
            MaterialForm form = new MaterialForm();
            form.ShowDialog();
        }

        private void Main_Load(object sender, EventArgs e)
        {

        }
    }
}

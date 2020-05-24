using System;
using System.Windows.Forms;
using zwscsclient.localhost.branch;


namespace zwscsclient
{
    public partial class BranchForm : Form
    {
        public BranchForm()
        {
            InitializeComponent();
        }

        private void BranchForm_Load(object sender, EventArgs e)
        {
            try
            {
                BranchServiceService service = new BranchServiceService();
                var branches = service.getAllBranch();
                dataGridView1.ColumnCount = 2;
                foreach (branch item in branches)
                {
                    object[] buffer = new object[2];
                    buffer[0] = item.description;
                    buffer[1] = item.tree;
                    dataGridView1.Rows.Add(buffer);
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }
   }
}

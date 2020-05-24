using System;
using System.Windows.Forms;
using zwscsclient.localhost.action;

namespace zwscsclient
{
    public partial class ActionForm : Form
    {
        public ActionForm()
        {
            InitializeComponent();
        }

        private void ActionForm_Load(object sender, EventArgs e)
        {
            try
            {
                ActionServiceService service = new ActionServiceService();
                var actions = service.getAllAction();
                dataGridView1.ColumnCount = 4;
                foreach (action item in actions)
                {
                    object[] buffer = new object[4];
                    buffer[0] = item.description;
                    buffer[1] = item.time;
                    buffer[2] = item.price;
                    buffer[3] = item.venik;
                    dataGridView1.Rows.Add(buffer);
                }
                label1.Text = service.getTotal().ToString();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }
    }
}

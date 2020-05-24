using System;
using System.Windows.Forms;
using zwscsclient.localhost.provider;

namespace zwscsclient
{
    public partial class ProviderForm : Form
    {
        public ProviderForm()
        {
            InitializeComponent();
        }

        private void ProviderForm_Load(object sender, EventArgs e)
        {
            try
            {
                ProviderServiceService service = new ProviderServiceService();
                var providers = service.getAllProvider();
                dataGridView1.ColumnCount = 3;
                foreach (provider item in providers)
                {
                    object[] buffer = new object[3];
                    buffer[0] = item.name;
                    buffer[1] = item.product;
                    buffer[2] = item.cooperation;
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

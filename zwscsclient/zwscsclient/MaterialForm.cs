using System;
using System.Windows.Forms;
using zwscsclient.localhost.material;

namespace zwscsclient
{
    public partial class MaterialForm : Form
    {
        public MaterialForm()
        {
            InitializeComponent();
        }

        private void MaterialForm_Load(object sender, EventArgs e)
        {
            try
            {
                MaterialServiceService service = new MaterialServiceService();
                var materials = service.getAllMaterials();
                dataGridView1.ColumnCount = 4;
                foreach (material item in materials)
                {
                    object[] buffer = new object[4];
                    buffer[0] = item.description;
                    buffer[1] = item.amount;
                    buffer[2] = item.price;
                    buffer[3] = item.name;
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

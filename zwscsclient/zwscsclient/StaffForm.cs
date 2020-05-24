using System;
using System.Windows.Forms;
using zwscsclient.localhost.staff;

namespace zwscsclient
{
    public partial class StaffForm : Form
    {
        public StaffForm()
        {
            InitializeComponent();
        }

        private void StaffForm_Load(object sender, EventArgs e)
        {
            try
            {
                StaffServiceService service = new StaffServiceService();
                var staffs = service.getAllStaff();
                dataGridView1.ColumnCount = 4;
                foreach (staff item in staffs)
                {
                    object[] buffer = new object[4];
                    buffer[0] = item.FIO;
                    buffer[1] = item.age;
                    buffer[2] = item.position;
                    buffer[3] = item.salary;
                    dataGridView1.Rows.Add(buffer);
                }
                label5.Text = service.getTotal().ToString();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RSMK2
{
    [Serializable]
    public class Staff
    {

        private string _fio;
        private int _age;
        private string _position;
        private double _salary;

        public Staff() { }

        public Staff(string FIO, int age, string position, double salary)
        {
            this._fio = FIO;
            this._age = age;
            this._position = position;
            this._salary = salary;
        }

        public string GetFIO()
        {
            return _fio;
        }

        public void SetFIO(string fio)
        {
            _fio = fio;
        }

        public int GetAge()
        {
            return _age;
        }

        public void SetAge(int age)
        {
            _age = age;
        }

        public string GetPosition()
        {
            return _position;
        }

        public void SetPosition(string position)
        {
            _position = position;
        }

        public double GetSalary()
        {
            return _salary;
        }

        public void SetSalary(double salary)
        {
            _salary = salary;
        }
    }
}

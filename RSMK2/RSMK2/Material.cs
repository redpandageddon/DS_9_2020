using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RSMK2
{
    [Serializable]
    public class Material
    {
        private string _name;
        private string _description;
        private double _price;
        private int _amount;

        public string GetName()
        {
            return _name;
        }

        public void SetName(string name) { _name = name; }

        public string GetDescription()
        {
            return _description;
        }

        public void SetDescription(string description) { _description = description; }

        public double GetPrice() => _price;

        public void SetPrice(double price) { _price = price; }

        public int GetAmount() => _amount;

        public void SetAmount(int amount) { _amount = amount; }

        public Material(string name, string description, double price, int amount)
        {
            _name = name;
            _description = description;
            _price = price;
            _amount = amount;
        }
    }
}

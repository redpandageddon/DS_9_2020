using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RSMK2
{
    [Serializable]
    public class Action
    {
        private string _name;
        private double _price;
        private double _time;
        private string _venik;

        public string GetName() => _name;
        public void SetName(string name) { _name = name; }
        public double GetPrice() => _price;
        public void SetPrice(double price) { _price = price; }
        public double GetTime() => _time;
        public void SetTime(double time) { _time = time; }
        public string GetBranch() => _venik;
        public void SetBranch(string tree) { _venik = tree; }

        public Action() { }
        public Action(string name, double price, double time, string venik)
        {
            _name = name;
            _price = price;
            _time = time;
            _venik = venik;
        }
    }
}

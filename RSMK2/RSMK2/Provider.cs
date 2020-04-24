using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RSMK2
{
    [Serializable]
    public class Provider
    {
        private int _cooperation;
        private string _name;
        private string _material;

        public int GetCooperation() => _cooperation;
        public void SetCooperation(int cooperation) { _cooperation = cooperation; }
        public string GetName() => _name;
        public void SetName(string name) { _name = name; }
        public string GetMaterial() => _material;
        public void SetMaterial(string material) { _material = material; }

        public Provider() { }

        public Provider(int cooperation, string name, string material)
        {
            _cooperation = cooperation;
            _name = name;
            _material = material;
        }
    }
}

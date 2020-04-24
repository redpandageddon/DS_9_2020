using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RSMK2
{
    [Serializable]
    public class Branch
    {
        private string _tree;
        private string _description;
        
        public Branch()
        {
            _tree        = string.Empty;
            _description = string.Empty;
        }

        public Branch(string tree, string description)
        {
            _tree        = tree;
            _description = description;
        }

        public string GetTree() => _tree;
        public void SetTree(string tree) { _tree = tree; }
        public string GetDescription() => _description;
        public void SetDescription(string description) { _description = description; }
    }
}

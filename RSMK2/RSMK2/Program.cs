using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Runtime.Remoting;
using System.Runtime.Remoting.Channels;
using System.Runtime.Remoting.Channels.Tcp;


namespace RSMK2
{
    class Program
    {
        static void Main(string[] args)
        {
            TcpChannel channel = new TcpChannel(9000);
            ChannelServices.RegisterChannel(channel, false);
            BranchOperationImpl lstBranch = new BranchOperationImpl();
            lstBranch.Add(new Branch("Береза", "описание"));
            lstBranch.Add(new Branch("Липа", "описание"));
            RemotingConfiguration.RegisterWellKnownServiceType(typeof(BranchOperationImpl), "branch", WellKnownObjectMode.Singleton);

            ActionOperationImpl lstAction = new ActionOperationImpl();
            lstAction.Add(new Action("спа",150d, 2d, "нет"));
            lstAction.Add(new Action("парная",3000d, 1d, "Липа"));
            RemotingConfiguration.RegisterWellKnownServiceType(typeof(ActionOperationImpl), "action", WellKnownObjectMode.Singleton);

            StaffOperationImpl lstStaff = new StaffOperationImpl();
            lstStaff.Add(new Staff("Mark Twen", 255, "admin", 1500d));
            lstStaff.Add(new Staff("Doctor Who", 32767, "CEO", 7500d));
            RemotingConfiguration.RegisterWellKnownServiceType(typeof(StaffOperationImpl), "staff", WellKnownObjectMode.Singleton);

            ProviderOperationImpl lstProvider = new ProviderOperationImpl();
            lstProvider.Add(new Provider(12, "quas", "soap"));
            lstProvider.Add(new Provider(132, "exort", "rocks"));
            RemotingConfiguration.RegisterWellKnownServiceType(typeof(ProviderOperationImpl), "provider", WellKnownObjectMode.Singleton);

            MaterialOperationImpl lstMaterial = new MaterialOperationImpl();
            lstMaterial.Add(new Material("rocks", "no", 150d, 2000));
            lstMaterial.Add(new Material("soap", "smells amazing", 23d, 25));
            RemotingConfiguration.RegisterWellKnownServiceType(typeof(MaterialOperationImpl), "material", WellKnownObjectMode.Singleton);

            Console.WriteLine("press enter to stop");
            Console.ReadLine();
        }
    }
}

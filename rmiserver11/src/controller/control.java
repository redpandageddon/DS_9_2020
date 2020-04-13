package controller;

import java.util.ArrayList;
import java.util.List;
import types.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class control extends UnicastRemoteObject implements IControl{
    
    private List<branch>          veniki;
    private List<staff>         personal;
    private List<postavshik> postavshiki;
    private List<rashodnik>   rashodniki;
    private List<action>          uslugi;
    
   public control() throws RemoteException {
       veniki      = new ArrayList<>();
       personal    = new ArrayList<>();
       postavshiki = new ArrayList<>();
       rashodniki  = new ArrayList<>();
       uslugi      = new ArrayList<>();
       
       veniki.add(new branch("Береза","какое-то описание"));
       veniki.add(new branch("Липа"  ,"какое-то описание"));
       veniki.add(new branch("Ольха" ,"какое-то описание"));
       
       personal.add(new staff("Жгутикова Клавдия Петровна",22,"Промоутер"    ,10000));
       personal.add(new staff("Мартова Марта Мартовна"    ,72,"Техслужащая"  ,60000));
       personal.add(new staff("Кремов Крем Кремович"      ,32,"Администратор",25000));
       
       rashodniki.add(new rashodnik("Камни","какое-то описание"));
       rashodniki.add(new rashodnik("Дрова","какое-то описание"));
       rashodniki.add(new rashodnik("Мыло" ,"какое-то описание"));
       
       postavshiki.add(new postavshik(12,"Супер поставщик", rashodniki.get(1)));
       postavshiki.add(new postavshik(14,"Арива"          , rashodniki.get(2)));
       postavshiki.add(new postavshik(32,"Кварта"         , rashodniki.get(0)));
       
       uslugi.add(new action("какое-то описание",200 ,2, veniki.get(1)));
       uslugi.add(new action("какое-то описание",700 ,1, veniki.get(2)));
       uslugi.add(new action("какое-то описание",1500,4, veniki.get(0)));
   }
   
   @Override
   public String getSotrudniki() throws RemoteException{
       String str = "";
       for(staff s : personal){
           str += s.getFIO()+ "\t" +s.getPosition() + "\n";
       }
       
       return str;
   }
   
   @Override
   public void addPersonal(String FIO, int age, String position, double salary) throws RemoteException {
       personal.add(new staff(FIO, age, position, salary));
   }
   
   @Override
   public void addUsluga(String desc, double price, double time, branch venik) throws RemoteException {
       uslugi.add(new action(desc, price, time, venik));
   }
   
   @Override
   public void addVenik(String desc, String tree) throws RemoteException{
       veniki.add(new branch(tree, desc));
   }
   
   @Override
   public void addRash(String anme, String desc) throws RemoteException{
       rashodniki.add(new rashodnik(anme, desc));
   }
   
   @Override
   public void addPostavshik(String name, String rashodnik) throws RemoteException{
       rashodnik tmp = null;
       for(rashodnik p: rashodniki){
           if(p.getName()==rashodnik){
               tmp = p;
           }
       }
       postavshiki.add(new postavshik(0, name, tmp));
   }
   
   @Override
   public Object[][] getVenikiArray() throws RemoteException {
   
        Object[][] tmp = new Object[veniki.size()][2];
        
        for(int i = 0; i < veniki.size(); i++){
           tmp[i][0] = veniki.get(i).getDescription();
           tmp[i][1] = veniki.get(i).getTree();
       }
       
       return tmp;
       
   }
   
   @Override
   public Object[][] getSotrudnikiArray() throws RemoteException {
       
       Object[][] tmp = new Object[personal.size()][4];
       
       for(int i = 0; i < personal.size(); i++){
           tmp[i][0] = personal.get(i).getFIO();
           tmp[i][1] = personal.get(i).getAge();
           tmp[i][2] = personal.get(i).getPosition();
           tmp[i][3] = personal.get(i).getSalary();
       }
       
       return tmp;
   }
   
    @Override
    public Object[][] getRashodnikiArray() throws RemoteException{
       
       Object[][] tmp = new Object[rashodniki.size()][2];
       
       for(int i = 0; i < rashodniki.size(); i++){
           tmp[i][0] = rashodniki.get(i).getName();
           tmp[i][1] = rashodniki.get(i).getDescription();
       }
       
       return tmp;
   }
    
    @Override
    public Object[][] getPostavshikiArray() throws RemoteException{
        Object[][] tmp = new Object[postavshiki.size()][3];
       
       for(int i = 0; i < postavshiki.size(); i++){
           tmp[i][0] = postavshiki.get(i).getCooperation();
           tmp[i][1] = postavshiki.get(i).getName();
           tmp[i][2] = postavshiki.get(i).getProduct();
       }
       
       return tmp;
    }
   
    @Override
    public Object[][] getUslugiArray() throws RemoteException{
       Object[][] tmp = new Object[uslugi.size()][4];
       for(int i = 0; i < uslugi.size(); i++){
           
           tmp[i][0] = uslugi.get(i).getDescription();
           tmp[i][1] = uslugi.get(i).getPrice();
           tmp[i][2] = uslugi.get(i).getTime();
           tmp[i][3] = uslugi.get(i).getVenik();
           
        }
       
       return tmp;
    }
   
    @Override
   public branch findVenik(String tree) throws RemoteException{
       for(branch b: veniki){
           if(b.getTree()== tree){
               return b;
           }
       }
       return null;
   }
   
   @Override
   public String[] getVeniki() throws RemoteException{
       String[] str = new String[veniki.size()];
       for(int i = 0; i < str.length; i++){
           str[i] = veniki.get(i).getTree();
       }
       
       return str;
   }
   
   @Override
   public String[] getRashodniki() throws RemoteException{
       String[] str = new String[rashodniki.size()];
       for(int i = 0; i < str.length; i++){
           str[i] = rashodniki.get(i).getName();
       }
       
       return str;
   }
   
   @Override
   public void deletePersonal(String FIO) throws RemoteException{
       for(staff s: personal){
           if(s.getFIO() == FIO)
               personal.remove(s);
       }
   }
   
   @Override
    public void deleteUsluga(String desc) throws RemoteException {
       for(int i = 0; i < uslugi.size(); i++){
           if(desc == uslugi.get(i).getDescription()){
               uslugi.remove(i);
           }
       }
   }
    
    @Override
    public void deleteRash(String name) throws RemoteException {
       for(int i = 0; i < rashodniki.size(); i++){
           if(name == rashodniki.get(i).getName()){
               rashodniki.remove(i);
           }
       }
   }
    
    @Override
    public void deleteVenik(String tree) throws RemoteException {
       for(int i = 0; i < veniki.size(); i++){
           if(tree == veniki.get(i).getTree()){
               veniki.remove(i);
           }
       }
   }
    
    @Override
    public void deletePostavshik(String name) throws RemoteException{
       for(int i = 0; i < postavshiki.size(); i++){
           if(name == postavshiki.get(i).getName()){
               postavshiki.remove(i);
           }
       }
   }
    
    @Override
    public String countZP() throws RemoteException{
        double zp = 0D;
        for(staff s: personal){
            zp += s.getSalary();
        }
        
        return "Общая з/п " + zp;
    }
    
    @Override
    public String countAvgPrice() throws RemoteException{
        double avg = 0D;
        for(action a: uslugi){
            avg += a.getPrice();
        }
        avg /= uslugi.size();
        
        return "средняя стоимость услуги " + avg;
    }
    
    @Override
    public String countSotr() throws RemoteException{
        double avg = 0D;
        for(postavshik p : postavshiki){
            avg += p.getCooperation();
        }
        avg /= postavshiki.size();
        
        return "среднее время сотрудничества " + avg;
    }
}

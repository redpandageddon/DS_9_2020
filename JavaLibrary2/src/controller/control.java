package controller;

import java.util.ArrayList;
import java.util.List;
import types.*;

public class control {
    
    private List<branch>          veniki;
    private List<staff>         personal;
    private List<postavshik> postavshiki;
    private List<rashodnik>   rashodniki;
    private List<action>          uslugi;
    
   public control(){
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
   public String toString(){
       String res = "";
       
       for(staff s : personal){
           res += s.getFIO()+ "\t" +s.getPosition() + "\n";
       }
       
       for(branch b : veniki){
           res += b.toString() + "\n";
       }
       
       for(rashodnik r: rashodniki){
           res += r.getName() + "\t" + r.getDescription() + "\n";
       }
       
       for(postavshik p: postavshiki){
           res += p.getName() + "\t" + p.getProduct() + "\t" + p.getCooperation() + "\n";
       }
       
       for(action a: uslugi){
           res += a.toString() + "\n";
       }
       
       return res;
   }
   
   public String getSotrudniki(){
       String str = "";
       for(staff s : personal){
           str += s.getFIO()+ "\t" +s.getPosition() + "\n";
       }
       
       return str;
   }
   
   public void addPersonal(String FIO, int age, String position, double salary){
       personal.add(new staff(FIO, age, position, salary));
   }
   
   public void addUsluga(String desc, double price, double time, branch venik){
       uslugi.add(new action(desc, price, time, venik));
   }
   
   public void addVenik(String desc, String tree){
       veniki.add(new branch(tree, desc));
   }
   
   public void addRash(String anme, String desc){
       rashodniki.add(new rashodnik(anme, desc));
   }
   
   public void addPostavshik(String name, String rashodnik){
       rashodnik tmp = null;
       for(rashodnik p: rashodniki){
           if(p.getName()==rashodnik){
               tmp = p;
           }
       }
       postavshiki.add(new postavshik(0, name, tmp));
   }
   
   public Object[][] getVenikiArray(){
   
        Object[][] tmp = new Object[veniki.size()][2];
        
        for(int i = 0; i < veniki.size(); i++){
           tmp[i][0] = veniki.get(i).getDescription();
           tmp[i][1] = veniki.get(i).getTree();
       }
       
       return tmp;
       
   }
   
   public Object[][] getSotrudnikiArray(){
       
       Object[][] tmp = new Object[personal.size()][4];
       
       for(int i = 0; i < personal.size(); i++){
           tmp[i][0] = personal.get(i).getFIO();
           tmp[i][1] = personal.get(i).getAge();
           tmp[i][2] = personal.get(i).getPosition();
           tmp[i][3] = personal.get(i).getSalary();
       }
       
       return tmp;
   }
   
    public Object[][] getRashodnikiArray(){
       
       Object[][] tmp = new Object[rashodniki.size()][2];
       
       for(int i = 0; i < rashodniki.size(); i++){
           tmp[i][0] = rashodniki.get(i).getName();
           tmp[i][1] = rashodniki.get(i).getDescription();
       }
       
       return tmp;
   }
    
    public Object[][] getPostavshikiArray(){
        Object[][] tmp = new Object[postavshiki.size()][3];
       
       for(int i = 0; i < postavshiki.size(); i++){
           tmp[i][0] = postavshiki.get(i).getCooperation();
           tmp[i][1] = postavshiki.get(i).getName();
           tmp[i][2] = postavshiki.get(i).getProduct();
       }
       
       return tmp;
    }
   
   public Object[][] getUslugiArray(){
       Object[][] tmp = new Object[uslugi.size()][4];
       for(int i = 0; i < uslugi.size(); i++){
           
           tmp[i][0] = uslugi.get(i).getDescription();
           tmp[i][1] = uslugi.get(i).getPrice();
           tmp[i][2] = uslugi.get(i).getTime();
           tmp[i][3] = uslugi.get(i).getVenik();
           
        }
       
       return tmp;
    }
   
   public branch findVenik(String tree){
       for(branch b: veniki){
           if(b.getTree()== tree){
               return b;
           }
       }
       return null;
   }
   
   public String[] getVeniki(){
       String[] str = new String[veniki.size()];
       for(int i = 0; i < str.length; i++){
           str[i] = veniki.get(i).getTree();
       }
       
       return str;
   }
   
   public String[] getRashodniki(){
       String[] str = new String[rashodniki.size()];
       for(int i = 0; i < str.length; i++){
           str[i] = rashodniki.get(i).getName();
       }
       
       return str;
   }
   
   public void deletePersonal(String FIO){
       for(staff s: personal){
           if(s.getFIO() == FIO)
               personal.remove(s);
       }
   }
   
    public void deleteUsluga(String desc){
       for(int i = 0; i < uslugi.size(); i++){
           if(desc == uslugi.get(i).getDescription()){
               uslugi.remove(i);
           }
       }
   }
      
    public void deleteRash(String name){
       for(int i = 0; i < rashodniki.size(); i++){
           if(name == rashodniki.get(i).getName()){
               rashodniki.remove(i);
           }
       }
   }
    
    public void deleteVenik(String tree){
       for(int i = 0; i < veniki.size(); i++){
           if(tree == veniki.get(i).getTree()){
               veniki.remove(i);
           }
       }
   }
    
    
    public void deletePostavshik(String name){
       for(int i = 0; i < postavshiki.size(); i++){
           if(name == postavshiki.get(i).getName()){
               postavshiki.remove(i);
           }
       }
   }
    
    public String countZP(){
        double zp = 0D;
        for(staff s: personal){
            zp += s.getSalary();
        }
        
        return "Общая з/п " + zp;
    }
    
    public String countAvgPrice(){
        double avg = 0D;
        for(action a: uslugi){
            avg += a.getPrice();
        }
        avg /= uslugi.size();
        
        return "средняя стоимость услуги " + avg;
    }
    
    public String countSotr(){
        double avg = 0D;
        for(postavshik p : postavshiki){
            avg += p.getCooperation();
        }
        avg /= postavshiki.size();
        
        return "среднее время сотрудничества " + avg;
    }
}

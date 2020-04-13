/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import types.branch;

/**
 *
 * @author User
 */
public interface IControl extends Remote {
    public String getSotrudniki() throws RemoteException;
     public void addPersonal(String FIO, int age, String position, double salary) throws RemoteException;
     public void addUsluga(String desc, double price, double time, branch venik) throws RemoteException;
     public void addVenik(String desc, String tree) throws RemoteException;
     public void addRash(String anme, String desc) throws RemoteException;
     public void addPostavshik(String name, String rashodnik) throws RemoteException;
     public Object[][] getVenikiArray() throws RemoteException;
     public Object[][] getSotrudnikiArray() throws RemoteException;
     public Object[][] getRashodnikiArray() throws RemoteException;
     public Object[][] getPostavshikiArray() throws RemoteException;
     public Object[][] getUslugiArray() throws RemoteException;
     public branch findVenik(String tree) throws RemoteException;
     public String[] getVeniki() throws RemoteException;
     public String[] getRashodniki() throws RemoteException;
     public void deletePersonal(String FIO) throws RemoteException;
     public void deleteUsluga(String desc) throws RemoteException;
     public void deleteRash(String name) throws RemoteException;
     public void deleteVenik(String tree) throws RemoteException;
     public void deletePostavshik(String name) throws RemoteException;
     public String countZP() throws RemoteException;
     public String countAvgPrice() throws RemoteException;
     public String countSotr() throws RemoteException;
}

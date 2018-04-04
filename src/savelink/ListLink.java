/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savelink;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author dinh son
 */
public class ListLink implements Serializable{
    private ArrayList<Link> listLinks=new ArrayList<Link>();

    public ListLink() {
    }

    public ArrayList<Link> getList() {
        return listLinks;
    }
    public void addLink(Link link){
        listLinks.add(link);
    }
}

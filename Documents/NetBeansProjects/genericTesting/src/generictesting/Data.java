/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generictesting;

import java.io.Serializable;

/**
 *
 * @author A555L-HENG
 */
public class Data implements Serializable {
    String name="";
    String Pagetitle="";
    String url="";
    boolean bookmark;
    
    public Data(String name,String Pagetitle,String url)
    {
        this.name=name;
        this.Pagetitle=Pagetitle;
        this.url=url;
        bookmark=false;
    }

    public String getName() {
        return name;
    }

    public String getPagetitle() {
        return Pagetitle;
    }

    public String getUrl() {
        return url;
    }

    public boolean isBookmark() {
        return bookmark;
    }
    
    public String toString()
    {
        return "WebpageName:" + name+ ", WebpageTitle:"+ Pagetitle+ ", PageUrl:"+ url;
    }
}

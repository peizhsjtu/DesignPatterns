package designpatterns.prototype.deepclone;

import java.io.Serializable;

public class DeepCloneTarget implements Serializable,Cloneable {
    private static final long serialVersionUID = 1L;

    private String cloneName;
    private String cloneClass;

    public DeepCloneTarget(String cloneName,String cloneClass){
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    //由于其属性只有String,因此只用clone()即可
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}

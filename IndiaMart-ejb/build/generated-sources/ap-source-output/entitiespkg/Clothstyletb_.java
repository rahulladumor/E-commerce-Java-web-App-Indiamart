package entitiespkg;

import entitiespkg.Productclothestb;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-09T21:20:36")
@StaticMetamodel(Clothstyletb.class)
public class Clothstyletb_ { 

    public static volatile SingularAttribute<Clothstyletb, Integer> clothStyleId;
    public static volatile SingularAttribute<Clothstyletb, String> style;
    public static volatile CollectionAttribute<Clothstyletb, Productclothestb> productclothestbCollection;
    public static volatile SingularAttribute<Clothstyletb, Boolean> isActive;

}
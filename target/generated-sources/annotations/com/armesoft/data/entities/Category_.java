package com.armesoft.data.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Category.class)
public abstract class Category_ {

	public static volatile CollectionAttribute<Category, FilmCategory> filmCategoryCollection;
	public static volatile SingularAttribute<Category, Date> lastUpdate;
	public static volatile SingularAttribute<Category, String> name;
	public static volatile SingularAttribute<Category, Integer> categoryId;

}


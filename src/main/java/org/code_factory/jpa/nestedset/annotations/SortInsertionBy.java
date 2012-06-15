package org.code_factory.jpa.nestedset.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Specifies the default ORDER BY clause to use when determining where to
 * insert a nested set node. The string follows the same 
 * 
 * @author Justin T. Arthur
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SortInsertionBy {
    /**
     * An <code>orderby_list</code> similar to what is accepted by the <code>OrderBy</code> annotation.  Specified as follows:
     *
     * <pre>
     *    orderby_list::= orderby_item [,orderby_item]*
     *    orderby_item::= [property_or_field_name] [ASC | DESC]
     * </pre>
     *
     * <p> If <code>ASC</code> or <code>DESC</code> is not specified,
     * <code>ASC</code> (ascending order) is assumed.
     */
     String value() default "";
}
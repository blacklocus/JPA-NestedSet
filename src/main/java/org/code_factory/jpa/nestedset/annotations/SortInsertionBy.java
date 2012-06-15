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
     * An array of entity field names that are used to determine where to insert a Node relative to its siblings.
     */
     String[] value() default {};
}
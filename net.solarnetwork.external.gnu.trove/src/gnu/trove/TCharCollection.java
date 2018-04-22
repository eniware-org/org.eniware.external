///////////////////////////////////////////////////////////////////////////////
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
///////////////////////////////////////////////////////////////////////////////

package gnu.trove;


//////////////////////////////////////////////////
// THIS IS A GENERATED CLASS. DO NOT HAND EDIT! //
//////////////////////////////////////////////////

import gnu.trove.iterator.TCharIterator;
import gnu.trove.procedure.TCharProcedure;

import java.util.Collection;
import java.io.Serializable;

/* ==================================================================
 *  Eniware Open sorce:Nikolai Manchev
 *  Apache License 2.0
 * ==================================================================
 */


public interface TCharCollection {
	static final long serialVersionUID = 1L;

    /**
     * Returns the value that is used to represent null. The default
     * value is generally zero, but can be changed during construction
     * of the collection.
     *
     * @return the value that represents null
     */
    char getNoEntryValue();


    /**
     * Returns the number of elements in this collection (its cardinality).  If this
     * collection contains more than <tt>Integer.MAX_VALUE</tt> elements, returns
     * <tt>Integer.MAX_VALUE</tt>.
     *
     * @return the number of elements in this collection (its cardinality)
     */
    int size();


    /**
     * Returns <tt>true</tt> if this collection contains no elements.
     *
     * @return <tt>true</tt> if this collection contains no elements
     */
    boolean isEmpty();


    /**
     * Returns <tt>true</tt> if this collection contains the specified element.
     *
     * @param entry an <code>char</code> value
     * @return true if the collection contains the specified element.
     */
    boolean contains( char entry );


    /**
     * Creates an iterator over the values of the collection.  The iterator
     * supports element deletion.
     *
     * @return an <code>TCharIterator</code> value
     */
    TCharIterator iterator();


    /**
     * Returns an array containing all of the elements in this collection.
     * If this collection makes any guarantees as to what order its elements
     * are returned by its iterator, this method must return the
     * elements in the same order.
     *
     * <p>The returned array will be "safe" in that no references to it
     * are maintained by this collection.  (In other words, this method must
     * allocate a new array even if this collection is backed by an array).
     * The caller is thus free to modify the returned array.
     *
     * <p>This method acts as bridge between array-based and collection-based
     * APIs.
     *
     * @return an array containing all the elements in this collection
     */
    char[] toArray();


    /**
     * Returns an array containing elements in this collection.
     *
     * <p>If this collection fits in the specified array with room to spare
     * (i.e., the array has more elements than this collection), the element in
     * the array immediately following the end of the collection is collection to
     * <tt>{@link #getNoEntryValue()}</tt>.  (This is useful in determining
     * the length of this collection <i>only</i> if the caller knows that this
     * collection does not contain any elements representing null.)
     *
     * <p>If the native array is smaller than the collection size,
     * the array will be filled with elements in Iterator order
     * until it is full and exclude the remainder.
     *
     * <p>If this collection makes any guarantees as to what order its elements
     * are returned by its iterator, this method must return the elements
     * in the same order.
     *
     * @param dest the array into which the elements of this collection are to be
     *        stored.
     * @return an <tt>char[]</tt> containing all the elements in this collection
     * @throws NullPointerException if the specified array is null
     */
    char[] toArray( char[] dest );


    /**
     * Inserts a value into the collection.
     *
     * @param entry a <code>char</code> value
     * @return true if the collection was modified by the add operation
     */
    boolean add( char entry );


    /**
     * Removes <tt>entry</tt> from the collection.
     *
     * @param entry an <code>char</code> value
     * @return true if the collection was modified by the remove operation.
     */
    boolean remove( char entry );


    /**
     * Tests the collection to determine if all of the elements in
     * <tt>collection</tt> are present.
     *
     * @param collection a <code>Collection</code> value
     * @return true if all elements were present in the collection.
     */
    boolean containsAll( Collection<?> collection );


    /**
     * Tests the collection to determine if all of the elements in
     * <tt>TCharCollection</tt> are present.
     *
     * @param collection a <code>TCharCollection</code> value
     * @return true if all elements were present in the collection.
     */
    boolean containsAll( TCharCollection collection );


    /**
     * Tests the collection to determine if all of the elements in
     * <tt>array</tt> are present.
     *
     * @param array as <code>array</code> of char primitives.
     * @return true if all elements were present in the collection.
     */
    boolean containsAll( char[] array );


    /**
     * Adds all of the elements in <tt>collection</tt> to the collection.
     *
     * @param collection a <code>Collection</code> value
     * @return true if the collection was modified by the add all operation.
     */
    boolean addAll( Collection<? extends Character> collection );


    /**
     * Adds all of the elements in the <tt>TCharCollection</tt> to the collection.
     *
     * @param collection a <code>TCharCollection</code> value
     * @return true if the collection was modified by the add all operation.
     */
    boolean addAll( TCharCollection collection );


    /**
     * Adds all of the elements in the <tt>array</tt> to the collection.
     *
     * @param array a <code>array</code> of char primitives.
     * @return true if the collection was modified by the add all operation.
     */
    boolean addAll( char[] array );


    /**
     * Removes any values in the collection which are not contained in
     * <tt>collection</tt>.
     *
     * @param collection a <code>Collection</code> value
     * @return true if the collection was modified by the retain all operation
     */
    boolean retainAll( Collection<?> collection );


    /**
     * Removes any values in the collection which are not contained in
     * <tt>TCharCollection</tt>.
     *
     * @param collection a <code>TCharCollection</code> value
     * @return true if the collection was modified by the retain all operation
     */
    boolean retainAll( TCharCollection collection );


    /**
     * Removes any values in the collection which are not contained in
     * <tt>array</tt>.
     *
     * @param array an <code>array</code> of char primitives.
     * @return true if the collection was modified by the retain all operation
     */
    boolean retainAll( char[] array );


    /**
     * Removes all of the elements in <tt>collection</tt> from the collection.
     *
     * @param collection a <code>Collection</code> value
     * @return true if the collection was modified by the remove all operation.
     */
    boolean removeAll( Collection<?> collection );


    /**
     * Removes all of the elements in <tt>TCharCollection</tt> from the collection.
     *
     * @param collection a <code>TCharCollection</code> value
     * @return true if the collection was modified by the remove all operation.
     */
    boolean removeAll( TCharCollection collection );


    /**
     * Removes all of the elements in <tt>array</tt> from the collection.
     *
     * @param array an <code>array</code> of char primitives.
     * @return true if the collection was modified by the remove all operation.
     */
    boolean removeAll( char[] array );


    /**
     * Empties the collection.
     */
    void clear();


    /**
     * Executes <tt>procedure</tt> for each element in the collection.
     *
     * @param procedure a <code>TCharProcedure</code> value
     * @return false if the loop over the collection terminated because
     * the procedure returned false for some value.
     */
    boolean forEach( TCharProcedure procedure );


    // Comparison and hashing

    /**
     * Compares the specified object with this collection for equality.  Returns
     * <tt>true</tt> if the specified object is also a collection, the two collection
     * have the same size, and every member of the specified collection is
     * contained in this collection (or equivalently, every member of this collection is
     * contained in the specified collection).  This definition ensures that the
     * equals method works properly across different implementations of the
     * collection interface.
     *
     * @param o object to be compared for equality with this collection
     * @return <tt>true</tt> if the specified object is equal to this collection
     */
    boolean equals( Object o );


    /**
     * Returns the hash code value for this collection.  The hash code of a collection is
     * defined to be the sum of the hash codes of the elements in the collection.
     * This ensures that <tt>s1.equals(s2)</tt> implies that
     * <tt>s1.hashCode()==s2.hashCode()</tt> for any two collection <tt>s1</tt>
     * and <tt>s2</tt>, as required by the general contract of
     * {@link Object#hashCode}.
     *
     * @return the hash code value for this collection
     * @see Object#equals(Object)
     * @see Collection#equals(Object)
     */
    int hashCode();


} // TCharCollection

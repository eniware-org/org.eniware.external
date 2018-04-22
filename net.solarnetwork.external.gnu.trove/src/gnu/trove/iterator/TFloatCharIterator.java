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

/*
 * ==================================================================
 *  Eniware Open sorce:Nikolai Manchev
 *  Apache License 2.0
 * ==================================================================
 */

package gnu.trove.iterator;

//////////////////////////////////////////////////
// THIS IS A GENERATED CLASS. DO NOT HAND EDIT! //
//////////////////////////////////////////////////


/**
 * Iterator for maps of type float and char.
 *
 * <p>The iterator semantics for Trove's primitive maps is slightly different
 * from those defined in <tt>java.util.Iterator</tt>, but still well within
 * the scope of the pattern, as defined by Gamma, et al.</p>
 *
 * <p>This iterator does <b>not</b> implicitly advance to the next entry when
 * the value at the current position is retrieved.  Rather, you must explicitly
 * ask the iterator to <tt>advance()</tt> and then retrieve either the <tt>key()</tt>,
 * the <tt>value()</tt> or both.  This is done so that you have the option, but not
 * the obligation, to retrieve keys and/or values as your application requires, and
 * without introducing wrapper objects that would carry both.  As the iteration is
 * stateful, access to the key/value parts of the current map entry happens in
 * constant time.</p>
 *
 * <p>In practice, the iterator is akin to a "search finger" that you move from
 * position to position.  Read or write operations affect the current entry only and
 * do not assume responsibility for moving the finger.</p>
 *
 * <p>Here are some sample scenarios for this class of iterator:</p>
 *
 * <pre>
 * // accessing keys/values through an iterator:
 * for ( TFloatCharIterator it = map.iterator(); it.hasNext(); ) {
 *   it.advance();
 *   if ( satisfiesCondition( it.key() ) {
 *     doSomethingWithValue( it.value() );
 *   }
 * }
 * </pre>
 *
 * <pre>
 * // modifying values in-place through iteration:
 * for ( TFloatCharIterator it = map.iterator(); it.hasNext(); ) {
 *   it.advance();
 *   if ( satisfiesCondition( it.key() ) {
 *     it.setValue( newValueForKey( it.key() ) );
 *   }
 * }
 * </pre>
 *
 * <pre>
 * // deleting entries during iteration:
 * for ( TFloatCharIterator it = map.iterator(); it.hasNext(); ) {
 *   it.advance();
 *   if ( satisfiesCondition( it.key() ) {
 *     it.remove();
 *   }
 * }
 * </pre>
 *
 * <pre>
 * // faster iteration by avoiding hasNext():
 * TFloatCharIterator iterator = map.iterator();
 * for ( int i = map.size(); i-- > 0; ) {
 *   iterator.advance();
 *   doSomethingWithKeyAndValue( iterator.key(), iterator.value() );
 * }
 * </pre>
 */
public interface TFloatCharIterator extends TAdvancingIterator {
    /**
     * Provides access to the key of the mapping at the iterator's position.
     * Note that you must <tt>advance()</tt> the iterator at least once
     * before invoking this method.
     *
     * @return the key of the entry at the iterator's current position.
     */
    public float key();

    /**
     * Provides access to the value of the mapping at the iterator's position.
     * Note that you must <tt>advance()</tt> the iterator at least once
     * before invoking this method.
     *
     * @return the value of the entry at the iterator's current position.
     */
    public char value();

    /**
     * Replace the value of the mapping at the iterator's position with the
     * specified value. Note that you must <tt>advance()</tt> the iterator at
     * least once before invoking this method.
     *
     * @param val the value to set in the current entry
     * @return the old value of the entry.
     */
    public char setValue( char val );
}

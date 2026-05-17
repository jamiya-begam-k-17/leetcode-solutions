/*
 * Problem #284: Peeking Iterator
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 12/20/2025, 7:15:03 PM
 * Link: https://leetcode.com/problems/peeking-iterator/
 */

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> iterator;
    private Integer nextVal;
    private boolean hasPeeked;
	public PeekingIterator(Iterator<Integer> iterator) {
	    this.iterator=iterator;
        this.nextVal = null;
        this.hasPeeked=false;
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(!hasPeeked)
        nextVal = iterator.next();
        hasPeeked=true;
        return nextVal;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    if(hasPeeked) {
            hasPeeked=false;
            int val = nextVal;
            nextVal=null;
            return val;
        } else {
            return iterator.next();
        }
	}
	
	@Override
	public boolean hasNext() {
	    return hasPeeked || iterator.hasNext();
	}
}

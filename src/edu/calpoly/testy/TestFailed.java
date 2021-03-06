/*
 * Copyright © 2018, Bill Foote, Cal Poly, San Luis Obispo, CA
 * 
 * Permission is hereby granted, free of charge, to any person obtaining 
 * a copy of this software and associated documentation files (the “Software”), 
 * to deal in the Software without restriction, including without limitation 
 * the rights to use, copy, modify, merge, publish, distribute, sublicense, 
 * and/or sell copies of the Software, and to permit persons to whom the 
 * Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included 
 * in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS 
 * OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, 
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL 
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER 
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package edu.calpoly.testy;

/**
 * An assertion that is thrown to indicate that a unit test has failed.
 */
public class TestFailed extends RuntimeException {

    /**
     * Constructs a new test failed exception with null as its detail message.
     */
    public TestFailed() {
    }

    /**
     * Constructs a new test failed exception with the specified 
     * detail message.
     *
     * @param message	The detail message
     */
    public TestFailed(String message) {
	super(message);
    }

    /**
     * Constructs a new test failed exception with the specified 
     * detail message and cause.
     *
     * @param message	The detail message
     * @param cause	The cause of the exception
     */
    public TestFailed(String message, Throwable cause) {
    }
}

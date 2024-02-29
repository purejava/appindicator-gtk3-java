package org.purejava.appindicator;

import java.lang.foreign.MemorySegment;

import static org.purejava.appindicator.app_indicator_h.g_signal_connect_object;

public final class GObject {

    /**
     * This is similar to g_signal_connect_data(), but uses a closure which ensures that the gobject stays alive during the call to c_handler by temporarily adding a reference count to gobject.
     * When the gobject is destroyed the signal handler will be automatically disconnected. Note that this is not currently threadsafe (ie: emitting a signal while gobject is being destroyed in another thread is not safe).
     * @param instance       The instance to connect to.
     * @param detailedSignal A string of the form “signal-name::detail”.
     * @param cHandler       The GCallback to connect.
     * @param gobject        The object to pass as data to c_handler. The argument can be NULL.
     * @param connectFlags   A combination of GConnectFlags.
     * @return The handler id.
     */
    public static long signalConnectObject(MemorySegment instance, MemorySegment detailedSignal, MemorySegment cHandler, MemorySegment gobject, int connectFlags) {
        if (null != instance
            && null!= detailedSignal
            && null != cHandler) {
                return g_signal_connect_object(instance, detailedSignal, cHandler, gobject, connectFlags);
        } else {
            return -1;
        }
    }
}

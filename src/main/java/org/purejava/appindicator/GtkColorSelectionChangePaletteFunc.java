// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;

/**
 * {@snippet :
 * void (*GtkColorSelectionChangePaletteFunc)(struct _GdkColor* colors,int n_colors);
 * }
 */
public interface GtkColorSelectionChangePaletteFunc {

    void apply(java.lang.foreign.MemorySegment colors, int n_colors);
    static MemorySegment allocate(GtkColorSelectionChangePaletteFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$1923.GtkColorSelectionChangePaletteFunc_UP$MH, fi, constants$1923.GtkColorSelectionChangePaletteFunc$FUNC, scope);
    }
    static GtkColorSelectionChangePaletteFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _colors, int _n_colors) -> {
            try {
                constants$1923.GtkColorSelectionChangePaletteFunc_DOWN$MH.invokeExact(symbol, _colors, _n_colors);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}



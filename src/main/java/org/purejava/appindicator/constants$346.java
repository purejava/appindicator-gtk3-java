// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$346 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$346() {}
    static final FunctionDescriptor GCacheNewFunc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GCacheNewFunc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GCacheNewFunc_UP$MH = RuntimeHelper.upcallHandle(GCacheNewFunc.class, "apply", constants$346.GCacheNewFunc_UP$FUNC);
    static final FunctionDescriptor GCacheNewFunc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GCacheNewFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$346.GCacheNewFunc_DOWN$FUNC
    );
    static final FunctionDescriptor GCacheDupFunc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GCacheDupFunc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GCacheDupFunc_UP$MH = RuntimeHelper.upcallHandle(GCacheDupFunc.class, "apply", constants$346.GCacheDupFunc_UP$FUNC);
    static final FunctionDescriptor GCacheDupFunc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GCacheDupFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$346.GCacheDupFunc_DOWN$FUNC
    );
    static final FunctionDescriptor GCacheDestroyFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GCacheDestroyFunc_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GCacheDestroyFunc_UP$MH = RuntimeHelper.upcallHandle(GCacheDestroyFunc.class, "apply", constants$346.GCacheDestroyFunc_UP$FUNC);
    static final FunctionDescriptor GCacheDestroyFunc_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GCacheDestroyFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$346.GCacheDestroyFunc_DOWN$FUNC
    );
}



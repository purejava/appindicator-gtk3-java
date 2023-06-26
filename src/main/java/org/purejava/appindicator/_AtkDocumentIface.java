// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

/**
 * {@snippet :
 * struct _AtkDocumentIface {
 *     GTypeInterface parent;
 *     const gchar* (*get_document_type)(AtkDocument*);
 *     gpointer (*get_document)(AtkDocument*);
 *     const gchar* (*get_document_locale)(AtkDocument*);
 *     AtkAttributeSet* (*get_document_attributes)(AtkDocument*);
 *     const gchar* (*get_document_attribute_value)(AtkDocument*,const gchar*);
 *     gboolean (*set_document_attribute)(AtkDocument*,const gchar*,const gchar*);
 *     gint (*get_current_page_number)(AtkDocument*);
 *     gint (*get_page_count)(AtkDocument*);
 * };
 * }
 */
public class _AtkDocumentIface {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("parent"),
        Constants$root.C_POINTER$LAYOUT.withName("get_document_type"),
        Constants$root.C_POINTER$LAYOUT.withName("get_document"),
        Constants$root.C_POINTER$LAYOUT.withName("get_document_locale"),
        Constants$root.C_POINTER$LAYOUT.withName("get_document_attributes"),
        Constants$root.C_POINTER$LAYOUT.withName("get_document_attribute_value"),
        Constants$root.C_POINTER$LAYOUT.withName("set_document_attribute"),
        Constants$root.C_POINTER$LAYOUT.withName("get_current_page_number"),
        Constants$root.C_POINTER$LAYOUT.withName("get_page_count")
    ).withName("_AtkDocumentIface");
    public static MemoryLayout $LAYOUT() {
        return _AtkDocumentIface.$struct$LAYOUT;
    }
    public static MemorySegment parent$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor get_document_type$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor get_document_type_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_document_type_UP$MH = RuntimeHelper.upcallHandle(get_document_type.class, "apply", _AtkDocumentIface.get_document_type_UP$FUNC);
    static final FunctionDescriptor get_document_type_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_document_type_DOWN$MH = RuntimeHelper.downcallHandle(
        _AtkDocumentIface.get_document_type_DOWN$FUNC
    );
    /**
     * {@snippet :
 * const gchar* (*get_document_type)(AtkDocument*);
     * }
     */
    public interface get_document_type {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_document_type fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_AtkDocumentIface.get_document_type_UP$MH, fi, _AtkDocumentIface.get_document_type$FUNC, scope);
        }
        static get_document_type ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_AtkDocumentIface.get_document_type_DOWN$MH.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_document_type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_document_type"));
    public static VarHandle get_document_type$VH() {
        return _AtkDocumentIface.get_document_type$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const gchar* (*get_document_type)(AtkDocument*);
     * }
     */
    public static MemorySegment get_document_type$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_AtkDocumentIface.get_document_type$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const gchar* (*get_document_type)(AtkDocument*);
     * }
     */
    public static void get_document_type$set(MemorySegment seg, MemorySegment x) {
        _AtkDocumentIface.get_document_type$VH.set(seg, x);
    }
    public static MemorySegment get_document_type$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_AtkDocumentIface.get_document_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_document_type$set(MemorySegment seg, long index, MemorySegment x) {
        _AtkDocumentIface.get_document_type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_document_type get_document_type(MemorySegment segment, SegmentScope scope) {
        return get_document_type.ofAddress(get_document_type$get(segment), scope);
    }
    static final FunctionDescriptor get_document$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor get_document_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_document_UP$MH = RuntimeHelper.upcallHandle(get_document.class, "apply", _AtkDocumentIface.get_document_UP$FUNC);
    static final FunctionDescriptor get_document_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_document_DOWN$MH = RuntimeHelper.downcallHandle(
        _AtkDocumentIface.get_document_DOWN$FUNC
    );
    /**
     * {@snippet :
 * gpointer (*get_document)(AtkDocument*);
     * }
     */
    public interface get_document {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(get_document fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_AtkDocumentIface.get_document_UP$MH, fi, _AtkDocumentIface.get_document$FUNC, scope);
        }
        static get_document ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_AtkDocumentIface.get_document_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_document$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_document"));
    public static VarHandle get_document$VH() {
        return _AtkDocumentIface.get_document$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gpointer (*get_document)(AtkDocument*);
     * }
     */
    public static MemorySegment get_document$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_AtkDocumentIface.get_document$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gpointer (*get_document)(AtkDocument*);
     * }
     */
    public static void get_document$set(MemorySegment seg, MemorySegment x) {
        _AtkDocumentIface.get_document$VH.set(seg, x);
    }
    public static MemorySegment get_document$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_AtkDocumentIface.get_document$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_document$set(MemorySegment seg, long index, MemorySegment x) {
        _AtkDocumentIface.get_document$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_document get_document(MemorySegment segment, SegmentScope scope) {
        return get_document.ofAddress(get_document$get(segment), scope);
    }
    static final FunctionDescriptor get_document_locale$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor get_document_locale_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_document_locale_UP$MH = RuntimeHelper.upcallHandle(get_document_locale.class, "apply", _AtkDocumentIface.get_document_locale_UP$FUNC);
    static final FunctionDescriptor get_document_locale_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_document_locale_DOWN$MH = RuntimeHelper.downcallHandle(
        _AtkDocumentIface.get_document_locale_DOWN$FUNC
    );
    /**
     * {@snippet :
 * const gchar* (*get_document_locale)(AtkDocument*);
     * }
     */
    public interface get_document_locale {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_document_locale fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_AtkDocumentIface.get_document_locale_UP$MH, fi, _AtkDocumentIface.get_document_locale$FUNC, scope);
        }
        static get_document_locale ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_AtkDocumentIface.get_document_locale_DOWN$MH.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_document_locale$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_document_locale"));
    public static VarHandle get_document_locale$VH() {
        return _AtkDocumentIface.get_document_locale$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const gchar* (*get_document_locale)(AtkDocument*);
     * }
     */
    public static MemorySegment get_document_locale$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_AtkDocumentIface.get_document_locale$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const gchar* (*get_document_locale)(AtkDocument*);
     * }
     */
    public static void get_document_locale$set(MemorySegment seg, MemorySegment x) {
        _AtkDocumentIface.get_document_locale$VH.set(seg, x);
    }
    public static MemorySegment get_document_locale$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_AtkDocumentIface.get_document_locale$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_document_locale$set(MemorySegment seg, long index, MemorySegment x) {
        _AtkDocumentIface.get_document_locale$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_document_locale get_document_locale(MemorySegment segment, SegmentScope scope) {
        return get_document_locale.ofAddress(get_document_locale$get(segment), scope);
    }
    static final FunctionDescriptor get_document_attributes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor get_document_attributes_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_document_attributes_UP$MH = RuntimeHelper.upcallHandle(get_document_attributes.class, "apply", _AtkDocumentIface.get_document_attributes_UP$FUNC);
    static final FunctionDescriptor get_document_attributes_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_document_attributes_DOWN$MH = RuntimeHelper.downcallHandle(
        _AtkDocumentIface.get_document_attributes_DOWN$FUNC
    );
    /**
     * {@snippet :
 * AtkAttributeSet* (*get_document_attributes)(AtkDocument*);
     * }
     */
    public interface get_document_attributes {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_document_attributes fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_AtkDocumentIface.get_document_attributes_UP$MH, fi, _AtkDocumentIface.get_document_attributes$FUNC, scope);
        }
        static get_document_attributes ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_AtkDocumentIface.get_document_attributes_DOWN$MH.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_document_attributes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_document_attributes"));
    public static VarHandle get_document_attributes$VH() {
        return _AtkDocumentIface.get_document_attributes$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * AtkAttributeSet* (*get_document_attributes)(AtkDocument*);
     * }
     */
    public static MemorySegment get_document_attributes$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_AtkDocumentIface.get_document_attributes$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * AtkAttributeSet* (*get_document_attributes)(AtkDocument*);
     * }
     */
    public static void get_document_attributes$set(MemorySegment seg, MemorySegment x) {
        _AtkDocumentIface.get_document_attributes$VH.set(seg, x);
    }
    public static MemorySegment get_document_attributes$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_AtkDocumentIface.get_document_attributes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_document_attributes$set(MemorySegment seg, long index, MemorySegment x) {
        _AtkDocumentIface.get_document_attributes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_document_attributes get_document_attributes(MemorySegment segment, SegmentScope scope) {
        return get_document_attributes.ofAddress(get_document_attributes$get(segment), scope);
    }
    static final FunctionDescriptor get_document_attribute_value$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor get_document_attribute_value_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_document_attribute_value_UP$MH = RuntimeHelper.upcallHandle(get_document_attribute_value.class, "apply", _AtkDocumentIface.get_document_attribute_value_UP$FUNC);
    static final FunctionDescriptor get_document_attribute_value_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_document_attribute_value_DOWN$MH = RuntimeHelper.downcallHandle(
        _AtkDocumentIface.get_document_attribute_value_DOWN$FUNC
    );
    /**
     * {@snippet :
 * const gchar* (*get_document_attribute_value)(AtkDocument*,const gchar*);
     * }
     */
    public interface get_document_attribute_value {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment path, java.lang.foreign.MemorySegment func_data);
        static MemorySegment allocate(get_document_attribute_value fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_AtkDocumentIface.get_document_attribute_value_UP$MH, fi, _AtkDocumentIface.get_document_attribute_value$FUNC, scope);
        }
        static get_document_attribute_value ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _path, java.lang.foreign.MemorySegment _func_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_AtkDocumentIface.get_document_attribute_value_DOWN$MH.invokeExact(symbol, _path, _func_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_document_attribute_value$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_document_attribute_value"));
    public static VarHandle get_document_attribute_value$VH() {
        return _AtkDocumentIface.get_document_attribute_value$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const gchar* (*get_document_attribute_value)(AtkDocument*,const gchar*);
     * }
     */
    public static MemorySegment get_document_attribute_value$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_AtkDocumentIface.get_document_attribute_value$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const gchar* (*get_document_attribute_value)(AtkDocument*,const gchar*);
     * }
     */
    public static void get_document_attribute_value$set(MemorySegment seg, MemorySegment x) {
        _AtkDocumentIface.get_document_attribute_value$VH.set(seg, x);
    }
    public static MemorySegment get_document_attribute_value$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_AtkDocumentIface.get_document_attribute_value$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_document_attribute_value$set(MemorySegment seg, long index, MemorySegment x) {
        _AtkDocumentIface.get_document_attribute_value$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_document_attribute_value get_document_attribute_value(MemorySegment segment, SegmentScope scope) {
        return get_document_attribute_value.ofAddress(get_document_attribute_value$get(segment), scope);
    }
    static final FunctionDescriptor set_document_attribute$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor set_document_attribute_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle set_document_attribute_UP$MH = RuntimeHelper.upcallHandle(set_document_attribute.class, "apply", _AtkDocumentIface.set_document_attribute_UP$FUNC);
    static final FunctionDescriptor set_document_attribute_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle set_document_attribute_DOWN$MH = RuntimeHelper.downcallHandle(
        _AtkDocumentIface.set_document_attribute_DOWN$FUNC
    );
    /**
     * {@snippet :
 * gboolean (*set_document_attribute)(AtkDocument*,const gchar*,const gchar*);
     * }
     */
    public interface set_document_attribute {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(set_document_attribute fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_AtkDocumentIface.set_document_attribute_UP$MH, fi, _AtkDocumentIface.set_document_attribute$FUNC, scope);
        }
        static set_document_attribute ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)_AtkDocumentIface.set_document_attribute_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle set_document_attribute$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("set_document_attribute"));
    public static VarHandle set_document_attribute$VH() {
        return _AtkDocumentIface.set_document_attribute$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gboolean (*set_document_attribute)(AtkDocument*,const gchar*,const gchar*);
     * }
     */
    public static MemorySegment set_document_attribute$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_AtkDocumentIface.set_document_attribute$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gboolean (*set_document_attribute)(AtkDocument*,const gchar*,const gchar*);
     * }
     */
    public static void set_document_attribute$set(MemorySegment seg, MemorySegment x) {
        _AtkDocumentIface.set_document_attribute$VH.set(seg, x);
    }
    public static MemorySegment set_document_attribute$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_AtkDocumentIface.set_document_attribute$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void set_document_attribute$set(MemorySegment seg, long index, MemorySegment x) {
        _AtkDocumentIface.set_document_attribute$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static set_document_attribute set_document_attribute(MemorySegment segment, SegmentScope scope) {
        return set_document_attribute.ofAddress(set_document_attribute$get(segment), scope);
    }
    static final FunctionDescriptor get_current_page_number$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor get_current_page_number_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_current_page_number_UP$MH = RuntimeHelper.upcallHandle(get_current_page_number.class, "apply", _AtkDocumentIface.get_current_page_number_UP$FUNC);
    static final FunctionDescriptor get_current_page_number_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_current_page_number_DOWN$MH = RuntimeHelper.downcallHandle(
        _AtkDocumentIface.get_current_page_number_DOWN$FUNC
    );
    /**
     * {@snippet :
 * gint (*get_current_page_number)(AtkDocument*);
     * }
     */
    public interface get_current_page_number {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(get_current_page_number fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_AtkDocumentIface.get_current_page_number_UP$MH, fi, _AtkDocumentIface.get_current_page_number$FUNC, scope);
        }
        static get_current_page_number ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)_AtkDocumentIface.get_current_page_number_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_current_page_number$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_current_page_number"));
    public static VarHandle get_current_page_number$VH() {
        return _AtkDocumentIface.get_current_page_number$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint (*get_current_page_number)(AtkDocument*);
     * }
     */
    public static MemorySegment get_current_page_number$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_AtkDocumentIface.get_current_page_number$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint (*get_current_page_number)(AtkDocument*);
     * }
     */
    public static void get_current_page_number$set(MemorySegment seg, MemorySegment x) {
        _AtkDocumentIface.get_current_page_number$VH.set(seg, x);
    }
    public static MemorySegment get_current_page_number$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_AtkDocumentIface.get_current_page_number$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_current_page_number$set(MemorySegment seg, long index, MemorySegment x) {
        _AtkDocumentIface.get_current_page_number$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_current_page_number get_current_page_number(MemorySegment segment, SegmentScope scope) {
        return get_current_page_number.ofAddress(get_current_page_number$get(segment), scope);
    }
    static final FunctionDescriptor get_page_count$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor get_page_count_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_page_count_UP$MH = RuntimeHelper.upcallHandle(get_page_count.class, "apply", _AtkDocumentIface.get_page_count_UP$FUNC);
    static final FunctionDescriptor get_page_count_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_page_count_DOWN$MH = RuntimeHelper.downcallHandle(
        _AtkDocumentIface.get_page_count_DOWN$FUNC
    );
    /**
     * {@snippet :
 * gint (*get_page_count)(AtkDocument*);
     * }
     */
    public interface get_page_count {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(get_page_count fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_AtkDocumentIface.get_page_count_UP$MH, fi, _AtkDocumentIface.get_page_count$FUNC, scope);
        }
        static get_page_count ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)_AtkDocumentIface.get_page_count_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_page_count$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_page_count"));
    public static VarHandle get_page_count$VH() {
        return _AtkDocumentIface.get_page_count$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint (*get_page_count)(AtkDocument*);
     * }
     */
    public static MemorySegment get_page_count$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_AtkDocumentIface.get_page_count$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint (*get_page_count)(AtkDocument*);
     * }
     */
    public static void get_page_count$set(MemorySegment seg, MemorySegment x) {
        _AtkDocumentIface.get_page_count$VH.set(seg, x);
    }
    public static MemorySegment get_page_count$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_AtkDocumentIface.get_page_count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_page_count$set(MemorySegment seg, long index, MemorySegment x) {
        _AtkDocumentIface.get_page_count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_page_count get_page_count(MemorySegment segment, SegmentScope scope) {
        return get_page_count.ofAddress(get_page_count$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


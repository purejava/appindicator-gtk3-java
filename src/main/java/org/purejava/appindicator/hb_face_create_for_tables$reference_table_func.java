// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * struct hb_blob_t* (*hb_face_create_for_tables$reference_table_func)(struct hb_face_t*,unsigned int,void*);
 * }
 */
public interface hb_face_create_for_tables$reference_table_func {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment face, int tag, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(hb_face_create_for_tables$reference_table_func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1441.const$3, fi, constants$196.const$3, scope);
    }
    static hb_face_create_for_tables$reference_table_func ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _face, int _tag, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$837.const$1.invokeExact(symbol, _face, _tag, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


package com.mavis.core.type.classreading;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Opcodes;

import com.mavis.core.type.ClassMetadata;

public class ClassMetadataReadingVisitor extends ClassVisitor implements ClassMetadata {
	public ClassMetadataReadingVisitor() {
		super(Opcodes.ASM6);
	}
}

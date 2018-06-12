package com.mavis.core.type.classreading;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Opcodes;

import com.mavis.core.type.ClassMetadata;

public class ClassMetadataReadingVisitor extends ClassVisitor implements ClassMetadata {
	public ClassMetadataReadingVisitor() {
		super(Opcodes.ASM6);
	}

	@Override
	public String getClassName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isInterface() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAnnotation() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAbstract() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isConcrete() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFinal() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isIndependent() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasEnclosingClass() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getEnclosingClassName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasSuperClass() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getSuperClassName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getInterfaceNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getMemberClassNames() {
		// TODO Auto-generated method stub
		return null;
	}
}

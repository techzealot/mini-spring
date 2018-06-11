package com.mavis.core.type.classreading;

import com.mavis.core.io.Resource;
import com.mavis.core.type.AnnotationMetadata;
import com.mavis.core.type.ClassMetadata;

public interface MetadataReader {
	Resource getResource();
	ClassMetadata getClassMetadata();
	AnnotationMetadata getAnnotationMetadata();
}

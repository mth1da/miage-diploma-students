package fr.pantheonsorbonne.miage;

import fr.pantheonsorbonne.miage.exception.FailedGeneratingEncryptedFileException;

/**
 * an object able to be serialized as a File
 * 
 * @author nherbaut
 *
 */
public abstract class FileGenerator<GENERATOR extends DiplomaGenerator> {

	protected final GENERATOR generator;

	protected FileGenerator(GENERATOR t) {
		this.generator = t;
	}

	public abstract void generateFile(String outputFile) throws FailedGeneratingEncryptedFileException;
}

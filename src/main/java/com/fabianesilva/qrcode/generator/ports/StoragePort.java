package com.fabianesilva.qrcode.generator.ports;

public interface StoragePort {

    String uploudFile(byte[] fileData, String fileName, String contentType);

}

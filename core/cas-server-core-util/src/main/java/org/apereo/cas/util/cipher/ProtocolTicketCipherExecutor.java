package org.apereo.cas.util.cipher;

/**
 * This is {@link ProtocolTicketCipherExecutor}.
 *
 * @author Misagh Moayyed
 * @since 5.0.0
 */
public class ProtocolTicketCipherExecutor extends BaseStringCipherExecutor {
    /**
     * Instantiates a new Protocol ticket cipher executor.
     *
     * @param secretKeyEncryption the secret key encryption
     * @param secretKeySigning    the secret key signing
     */
    public ProtocolTicketCipherExecutor(final String secretKeyEncryption, final String secretKeySigning) {
        super(secretKeyEncryption, secretKeySigning);
    }

    /**
     * Instantiates a new Protocol ticket cipher executor.
     *
     * @param secretKeyEncryption                  the secret key encryption
     * @param secretKeySigning                     the secret key signing
     * @param contentEncryptionAlgorithmIdentifier the content encryption algorithm identifier
     */
    public ProtocolTicketCipherExecutor(final String secretKeyEncryption, final String secretKeySigning, 
                                        final String contentEncryptionAlgorithmIdentifier) {
        super(secretKeyEncryption, secretKeySigning, contentEncryptionAlgorithmIdentifier);
    }

    @Override
    public String getName() {
        return "CAS Protocol Tickets";
    }
}

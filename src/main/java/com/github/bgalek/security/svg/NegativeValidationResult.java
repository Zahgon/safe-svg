package com.github.bgalek.security.svg;

import java.util.Collections;
import java.util.Set;

class NegativeValidationResult implements ValidationResult {

    @Override
    public boolean hasViolations() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Set<String> getOffendingElements() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

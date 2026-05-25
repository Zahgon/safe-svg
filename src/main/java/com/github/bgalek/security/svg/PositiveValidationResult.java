package com.github.bgalek.security.svg;

import java.util.Set;

class PositiveValidationResult implements ValidationResult {

    private final Set<String> offendingElements;

    PositiveValidationResult(Set<String> offendingElements) {
        this.offendingElements = offendingElements;
    }

    @Override
    public boolean hasViolations() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Set<String> getOffendingElements() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

package com.artHub.config;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

public class SiteMeshConfig extends ConfigurableSiteMeshFilter {

    @Override
    protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
        builder
        // Map decorators to path patterns.
        .addDecoratorPath("/login", "/WEB-INF/views/template/decorator/emptyLayout.jsp")
        .addDecoratorPath("/*", "/WEB-INF/views/template/decorator/defaultLayout.jsp")
        // Exclude path from decoration.
        .addExcludedPath("/login")
        .addExcludedPath("**/download/*")
        .addExcludedPath("**/ajax/*")
        .addExcludedPath("**/api/*")
        .setMimeTypes("text/html");
    }

}

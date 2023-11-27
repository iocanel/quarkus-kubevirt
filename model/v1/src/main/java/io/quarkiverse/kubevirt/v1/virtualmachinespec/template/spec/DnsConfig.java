package io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "nameservers", "options", "searches" })
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@lombok.ToString()
@lombok.EqualsAndHashCode()
@io.sundr.builder.annotations.Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectMeta.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectReference.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.LabelSelector.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Container.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.EnvVar.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ContainerPort.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Volume.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.VolumeMount.class)
})
public class DnsConfig implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * A list of DNS name server IP addresses. This will be appended to the base nameservers generated from DNSPolicy.
     * Duplicated nameservers will be removed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nameservers")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A list of DNS name server IP addresses. This will be appended to the base nameservers generated from DNSPolicy. Duplicated nameservers will be removed.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> nameservers;

    public java.util.List<String> getNameservers() {
        return nameservers;
    }

    public void setNameservers(java.util.List<String> nameservers) {
        this.nameservers = nameservers;
    }

    /**
     * A list of DNS resolver options. This will be merged with the base options generated from DNSPolicy. Duplicated entries
     * will be removed. Resolution options given in Options will override those that appear in the base DNSPolicy.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("options")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A list of DNS resolver options. This will be merged with the base options generated from DNSPolicy. Duplicated entries will be removed. Resolution options given in Options will override those that appear in the base DNSPolicy.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.dnsconfig.Options> options;

    public java.util.List<io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.dnsconfig.Options> getOptions() {
        return options;
    }

    public void setOptions(
            java.util.List<io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.dnsconfig.Options> options) {
        this.options = options;
    }

    /**
     * A list of DNS search domains for host-name lookup. This will be appended to the base search paths generated from
     * DNSPolicy. Duplicated search paths will be removed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("searches")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A list of DNS search domains for host-name lookup. This will be appended to the base search paths generated from DNSPolicy. Duplicated search paths will be removed.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> searches;

    public java.util.List<String> getSearches() {
        return searches;
    }

    public void setSearches(java.util.List<String> searches) {
        this.searches = searches;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore()
    private java.util.Map<String, Object> additionalProperties = new java.util.HashMap<>();

    @com.fasterxml.jackson.annotation.JsonAnyGetter()
    public java.util.Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    @com.fasterxml.jackson.annotation.JsonAnySetter()
    public void setAdditionalProperties(java.util.Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @com.fasterxml.jackson.annotation.JsonAnySetter()
    public void setAdditionalProperty(java.lang.String key, java.lang.Object value) {
        this.additionalProperties.put(key, value);
    }
}

package io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.datavolumetemplates.spec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "blank", "http", "imageio", "pvc", "registry", "s3", "upload", "vddk" })
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
public class Source implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * DataVolumeBlankImage provides the parameters to create a new raw blank image for the PVC
     */
    @com.fasterxml.jackson.annotation.JsonProperty("blank")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DataVolumeBlankImage provides the parameters to create a new raw blank image for the PVC")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.datavolumetemplates.spec.source.Blank blank;

    public io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.datavolumetemplates.spec.source.Blank getBlank() {
        return blank;
    }

    public void setBlank(
            io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.datavolumetemplates.spec.source.Blank blank) {
        this.blank = blank;
    }

    /**
     * DataVolumeSourceHTTP can be either an http or https endpoint, with an optional basic auth user name and password, and an
     * optional configmap containing additional CAs
     */
    @com.fasterxml.jackson.annotation.JsonProperty("http")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DataVolumeSourceHTTP can be either an http or https endpoint, with an optional basic auth user name and password, and an optional configmap containing additional CAs")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.datavolumetemplates.spec.source.Http http;

    public io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.datavolumetemplates.spec.source.Http getHttp() {
        return http;
    }

    public void setHttp(
            io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.datavolumetemplates.spec.source.Http http) {
        this.http = http;
    }

    /**
     * DataVolumeSourceImageIO provides the parameters to create a Data Volume from an imageio source
     */
    @com.fasterxml.jackson.annotation.JsonProperty("imageio")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DataVolumeSourceImageIO provides the parameters to create a Data Volume from an imageio source")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.datavolumetemplates.spec.source.Imageio imageio;

    public io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.datavolumetemplates.spec.source.Imageio getImageio() {
        return imageio;
    }

    public void setImageio(
            io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.datavolumetemplates.spec.source.Imageio imageio) {
        this.imageio = imageio;
    }

    /**
     * DataVolumeSourcePVC provides the parameters to create a Data Volume from an existing PVC
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pvc")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DataVolumeSourcePVC provides the parameters to create a Data Volume from an existing PVC")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.datavolumetemplates.spec.source.Pvc pvc;

    public io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.datavolumetemplates.spec.source.Pvc getPvc() {
        return pvc;
    }

    public void setPvc(
            io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.datavolumetemplates.spec.source.Pvc pvc) {
        this.pvc = pvc;
    }

    /**
     * DataVolumeSourceRegistry provides the parameters to create a Data Volume from an registry source
     */
    @com.fasterxml.jackson.annotation.JsonProperty("registry")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DataVolumeSourceRegistry provides the parameters to create a Data Volume from an registry source")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.datavolumetemplates.spec.source.Registry registry;

    public io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.datavolumetemplates.spec.source.Registry getRegistry() {
        return registry;
    }

    public void setRegistry(
            io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.datavolumetemplates.spec.source.Registry registry) {
        this.registry = registry;
    }

    /**
     * DataVolumeSourceS3 provides the parameters to create a Data Volume from an S3 source
     */
    @com.fasterxml.jackson.annotation.JsonProperty("s3")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DataVolumeSourceS3 provides the parameters to create a Data Volume from an S3 source")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.datavolumetemplates.spec.source.S3 s3;

    public io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.datavolumetemplates.spec.source.S3 getS3() {
        return s3;
    }

    public void setS3(
            io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.datavolumetemplates.spec.source.S3 s3) {
        this.s3 = s3;
    }

    /**
     * DataVolumeSourceUpload provides the parameters to create a Data Volume by uploading the source
     */
    @com.fasterxml.jackson.annotation.JsonProperty("upload")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DataVolumeSourceUpload provides the parameters to create a Data Volume by uploading the source")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.datavolumetemplates.spec.source.Upload upload;

    public io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.datavolumetemplates.spec.source.Upload getUpload() {
        return upload;
    }

    public void setUpload(
            io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.datavolumetemplates.spec.source.Upload upload) {
        this.upload = upload;
    }

    /**
     * DataVolumeSourceVDDK provides the parameters to create a Data Volume from a Vmware source
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vddk")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("DataVolumeSourceVDDK provides the parameters to create a Data Volume from a Vmware source")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.datavolumetemplates.spec.source.Vddk vddk;

    public io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.datavolumetemplates.spec.source.Vddk getVddk() {
        return vddk;
    }

    public void setVddk(
            io.quarkiverse.kubevirt.pool.v1alpha1.virtualmachinepoolspec.virtualmachinetemplate.spec.datavolumetemplates.spec.source.Vddk vddk) {
        this.vddk = vddk;
    }
}

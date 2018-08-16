// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/grafeas/grafeas.proto

package io.grafeas.v1beta1;

public interface NoteOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.Note)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The name of the note in the form of
   * `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The name of the note in the form of
   * `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * A one sentence description of this note.
   * </pre>
   *
   * <code>string short_description = 2;</code>
   */
  java.lang.String getShortDescription();
  /**
   * <pre>
   * A one sentence description of this note.
   * </pre>
   *
   * <code>string short_description = 2;</code>
   */
  com.google.protobuf.ByteString
      getShortDescriptionBytes();

  /**
   * <pre>
   * A detailed description of this note.
   * </pre>
   *
   * <code>string long_description = 3;</code>
   */
  java.lang.String getLongDescription();
  /**
   * <pre>
   * A detailed description of this note.
   * </pre>
   *
   * <code>string long_description = 3;</code>
   */
  com.google.protobuf.ByteString
      getLongDescriptionBytes();

  /**
   * <pre>
   * Output only. The type of analysis. This field can be used as a filter in
   * list requests.
   * </pre>
   *
   * <code>.grafeas.v1beta1.NoteKind kind = 4;</code>
   */
  int getKindValue();
  /**
   * <pre>
   * Output only. The type of analysis. This field can be used as a filter in
   * list requests.
   * </pre>
   *
   * <code>.grafeas.v1beta1.NoteKind kind = 4;</code>
   */
  io.grafeas.v1beta1.common.NoteKind getKind();

  /**
   * <pre>
   * URLs associated with this note.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.RelatedUrl related_url = 5;</code>
   */
  java.util.List<io.grafeas.v1beta1.common.RelatedUrl> 
      getRelatedUrlList();
  /**
   * <pre>
   * URLs associated with this note.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.RelatedUrl related_url = 5;</code>
   */
  io.grafeas.v1beta1.common.RelatedUrl getRelatedUrl(int index);
  /**
   * <pre>
   * URLs associated with this note.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.RelatedUrl related_url = 5;</code>
   */
  int getRelatedUrlCount();
  /**
   * <pre>
   * URLs associated with this note.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.RelatedUrl related_url = 5;</code>
   */
  java.util.List<? extends io.grafeas.v1beta1.common.RelatedUrlOrBuilder> 
      getRelatedUrlOrBuilderList();
  /**
   * <pre>
   * URLs associated with this note.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.RelatedUrl related_url = 5;</code>
   */
  io.grafeas.v1beta1.common.RelatedUrlOrBuilder getRelatedUrlOrBuilder(
      int index);

  /**
   * <pre>
   * Time of expiration for this note. Empty if note does not expire.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_time = 6;</code>
   */
  boolean hasExpirationTime();
  /**
   * <pre>
   * Time of expiration for this note. Empty if note does not expire.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_time = 6;</code>
   */
  com.google.protobuf.Timestamp getExpirationTime();
  /**
   * <pre>
   * Time of expiration for this note. Empty if note does not expire.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpirationTimeOrBuilder();

  /**
   * <pre>
   * Output only. The time this note was created. This field can be used as a
   * filter in list requests.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7;</code>
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. The time this note was created. This field can be used as a
   * filter in list requests.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7;</code>
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. The time this note was created. This field can be used as a
   * filter in list requests.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The time this note was last updated. This field can be used as
   * a filter in list requests.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8;</code>
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. The time this note was last updated. This field can be used as
   * a filter in list requests.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8;</code>
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. The time this note was last updated. This field can be used as
   * a filter in list requests.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * Other notes related to this note.
   * </pre>
   *
   * <code>repeated string related_note_names = 9;</code>
   */
  java.util.List<java.lang.String>
      getRelatedNoteNamesList();
  /**
   * <pre>
   * Other notes related to this note.
   * </pre>
   *
   * <code>repeated string related_note_names = 9;</code>
   */
  int getRelatedNoteNamesCount();
  /**
   * <pre>
   * Other notes related to this note.
   * </pre>
   *
   * <code>repeated string related_note_names = 9;</code>
   */
  java.lang.String getRelatedNoteNames(int index);
  /**
   * <pre>
   * Other notes related to this note.
   * </pre>
   *
   * <code>repeated string related_note_names = 9;</code>
   */
  com.google.protobuf.ByteString
      getRelatedNoteNamesBytes(int index);

  /**
   * <pre>
   * A note describing a package vulnerability.
   * </pre>
   *
   * <code>.grafeas.v1beta1.vulnerability.Vulnerability vulnerability = 10;</code>
   */
  boolean hasVulnerability();
  /**
   * <pre>
   * A note describing a package vulnerability.
   * </pre>
   *
   * <code>.grafeas.v1beta1.vulnerability.Vulnerability vulnerability = 10;</code>
   */
  io.grafeas.v1beta1.vulnerability.Vulnerability getVulnerability();
  /**
   * <pre>
   * A note describing a package vulnerability.
   * </pre>
   *
   * <code>.grafeas.v1beta1.vulnerability.Vulnerability vulnerability = 10;</code>
   */
  io.grafeas.v1beta1.vulnerability.VulnerabilityOrBuilder getVulnerabilityOrBuilder();

  /**
   * <pre>
   * A note describing build provenance for a verifiable build.
   * </pre>
   *
   * <code>.grafeas.v1beta1.build.Build build = 11;</code>
   */
  boolean hasBuild();
  /**
   * <pre>
   * A note describing build provenance for a verifiable build.
   * </pre>
   *
   * <code>.grafeas.v1beta1.build.Build build = 11;</code>
   */
  io.grafeas.v1beta1.build.Build getBuild();
  /**
   * <pre>
   * A note describing build provenance for a verifiable build.
   * </pre>
   *
   * <code>.grafeas.v1beta1.build.Build build = 11;</code>
   */
  io.grafeas.v1beta1.build.BuildOrBuilder getBuildOrBuilder();

  /**
   * <pre>
   * A note describing a base image.
   * </pre>
   *
   * <code>.grafeas.v1beta1.image.Basis base_image = 12;</code>
   */
  boolean hasBaseImage();
  /**
   * <pre>
   * A note describing a base image.
   * </pre>
   *
   * <code>.grafeas.v1beta1.image.Basis base_image = 12;</code>
   */
  io.grafeas.v1beta1.image.Basis getBaseImage();
  /**
   * <pre>
   * A note describing a base image.
   * </pre>
   *
   * <code>.grafeas.v1beta1.image.Basis base_image = 12;</code>
   */
  io.grafeas.v1beta1.image.BasisOrBuilder getBaseImageOrBuilder();

  /**
   * <pre>
   * A note describing a package hosted by various package managers.
   * </pre>
   *
   * <code>.grafeas.v1beta1.package.Package package = 13;</code>
   */
  boolean hasPackage();
  /**
   * <pre>
   * A note describing a package hosted by various package managers.
   * </pre>
   *
   * <code>.grafeas.v1beta1.package.Package package = 13;</code>
   */
  io.grafeas.v1beta1.pkg.Package getPackage();
  /**
   * <pre>
   * A note describing a package hosted by various package managers.
   * </pre>
   *
   * <code>.grafeas.v1beta1.package.Package package = 13;</code>
   */
  io.grafeas.v1beta1.pkg.PackageOrBuilder getPackageOrBuilder();

  /**
   * <pre>
   * A note describing something that can be deployed.
   * </pre>
   *
   * <code>.grafeas.v1beta1.deployment.Deployable deployable = 14;</code>
   */
  boolean hasDeployable();
  /**
   * <pre>
   * A note describing something that can be deployed.
   * </pre>
   *
   * <code>.grafeas.v1beta1.deployment.Deployable deployable = 14;</code>
   */
  io.grafeas.v1beta1.deployment.Deployable getDeployable();
  /**
   * <pre>
   * A note describing something that can be deployed.
   * </pre>
   *
   * <code>.grafeas.v1beta1.deployment.Deployable deployable = 14;</code>
   */
  io.grafeas.v1beta1.deployment.DeployableOrBuilder getDeployableOrBuilder();

  /**
   * <pre>
   * A note describing the initial analysis of a resource.
   * </pre>
   *
   * <code>.grafeas.v1beta1.discovery.Discovery discovery = 15;</code>
   */
  boolean hasDiscovery();
  /**
   * <pre>
   * A note describing the initial analysis of a resource.
   * </pre>
   *
   * <code>.grafeas.v1beta1.discovery.Discovery discovery = 15;</code>
   */
  io.grafeas.v1beta1.discovery.Discovery getDiscovery();
  /**
   * <pre>
   * A note describing the initial analysis of a resource.
   * </pre>
   *
   * <code>.grafeas.v1beta1.discovery.Discovery discovery = 15;</code>
   */
  io.grafeas.v1beta1.discovery.DiscoveryOrBuilder getDiscoveryOrBuilder();

  /**
   * <pre>
   * A note describing an attestation role.
   * </pre>
   *
   * <code>.grafeas.v1beta1.attestation.Authority attestation_authority = 16;</code>
   */
  boolean hasAttestationAuthority();
  /**
   * <pre>
   * A note describing an attestation role.
   * </pre>
   *
   * <code>.grafeas.v1beta1.attestation.Authority attestation_authority = 16;</code>
   */
  io.grafeas.v1beta1.attestation.Authority getAttestationAuthority();
  /**
   * <pre>
   * A note describing an attestation role.
   * </pre>
   *
   * <code>.grafeas.v1beta1.attestation.Authority attestation_authority = 16;</code>
   */
  io.grafeas.v1beta1.attestation.AuthorityOrBuilder getAttestationAuthorityOrBuilder();

  public io.grafeas.v1beta1.Note.TypeCase getTypeCase();
}
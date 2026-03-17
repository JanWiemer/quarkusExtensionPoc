package org.jaw.extension;

import io.quarkus.deployment.IsLocalDevelopment;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;
import io.quarkus.devui.spi.page.CardPageBuildItem;
import io.quarkus.devui.spi.page.Page;
import io.quarkus.vertx.http.deployment.NonApplicationRootPathBuildItem;

class ExtensionProcessor {

  private static final String FEATURE = "example-extension";

  @BuildStep
  FeatureBuildItem feature() {
    return new FeatureBuildItem(FEATURE);
  }

  @BuildStep(onlyIf = IsLocalDevelopment.class)
  public CardPageBuildItem createDevUiCard(NonApplicationRootPathBuildItem pathBuildItem) {
    CardPageBuildItem card = new CardPageBuildItem();
    card.addPage( //
            Page.externalPageBuilder("Special-Page-Link").title("Special-Page-Link") //
                    .url(pathBuildItem.resolvePath("specialPage")).isHtmlContent());
    return card;
  }

}
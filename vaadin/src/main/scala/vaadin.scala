/**
 * vaddin
 *
 * @see
 *   <a href="https://github.com/vaadin/web-components/tree/21.0/packages/vaadin-accordion">Component Collection
 *   Documentation</a>
 */
package com.github.zhangzhonglai.laminar.webcomponents.vaddin {

  import com.raquo.domtypes.generic.codecs._
  import com.raquo.laminar.api.L._
  import com.raquo.laminar.builders.HtmlTag
  import com.raquo.laminar.keys.{ReactiveHtmlAttr, ReactiveProp, ReactiveStyle}
  import com.raquo.laminar.nodes.ReactiveHtmlElement

  import org.scalajs.dom

  import scala.scalajs.js
  import scala.scalajs.js.annotation.JSImport

  object styles {
    import com.raquo.domtypes.generic.keys.Style

  }

  /**
   * vaadin-accordion
   *
   * Accordion is a vertically stacked set of expandable panels. It reduces clutter and helps maintain the user’s focus
   * by showing only the relevant content at a time.
   *
   * {@literal @vaadin/vaadin-accordion@21.0.2}
   *
   * @see
   *   <a href="https://github.com/vaadin/web-components/tree/21.0/packages/vaadin-accordion">Component
   *   Documentation</a>
   */
  object Accordion {

    @js.native
    trait RawElement extends js.Object {}

    @js.native
    @JSImport("@vaadin/vaadin-accordion", JSImport.Default)
    object RawImport extends js.Object {}
    RawImport // needed because objects are lazy

    type Ref         = dom.html.Element with RawElement
    type El          = ReactiveHtmlElement[Ref]
    type ModFunction = Accordion.type => Mod[El]

    private val tag = new HtmlTag[Ref]("vaadin-accordion", void = false)

    object slots {}

    object styles {
      import com.raquo.domtypes.generic.keys.Style

    }

    def apply(mods: ModFunction*): El =
      tag(mods.map(_(Accordion)): _*)

    /**
     * vaadin-accordion-panel
     *
     * <vaadin-accordion> is a Web Component implementing the vertically stacked set of expandable panels, part of the
     * Vaadin components.
     *
     * {@literal @vaadin/vaadin-accordion@21.0.2}
     *
     * @see
     *   <a href="https://github.com/vaadin/web-components/tree/21.0/packages/vaadin-accordion">Component
     *   Documentation</a>
     */
    object AccordionPanel {

      @js.native
      trait RawElement extends js.Object {

        /**
         * Accordion has three theme variants: filled, small and reverse. Set the theme attribute separately for each
         * panel, not on Accordion itself. Theme names can be combined with each other, for example, all three themes
         * filled, small, and reverse can be applied to a panel.
         *
         * @see
         *   <a href="https://github.com/vaadin/web-components/tree/21.0/packages/vaadin-accordion">Component
         *   Documentation</a>
         */
        def `theme`: Any

        /**
         * Accordion panels can be disabled to prevent them from being expanded or collapsed. Details can be disabled to
         * prevent them from being expanded or collapsed. Components inside a disabled expanded panel are automatically
         * disabled as well.
         *
         * @see
         *   <a href="https://github.com/vaadin/web-components/tree/21.0/packages/vaadin-accordion">Component
         *   Documentation</a>
         */
        def `disabled`: Boolean

      }

      @js.native
      @JSImport("@vaadin/vaadin-accordion/vaadin-accordion-panel", JSImport.Default)
      object RawImport extends js.Object {}
      RawImport // needed because objects are lazy

      type Ref         = dom.html.Element with RawElement
      type El          = ReactiveHtmlElement[Ref]
      type ModFunction = AccordionPanel.type => Mod[El]

      private val tag = new HtmlTag[Ref]("vaadin-accordion-panel", void = false)

      object slots {

        /**
         * This is the collapsible part of a panel. It can contain any component. When the content area is collapsed,
         * the content is invisible and inaccessible by keyboard or screen reader.
         *
         * @see
         *   <a href="https://github.com/vaadin/web-components/tree/21.0/packages/vaadin-accordion">Component
         *   Documentation</a>
         */
        def default(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := ""))

        /**
         * The summary is the part that is always visible, and typically describes the contents, for example, with a
         * title. Clicking on the summary toggles the content area’s visibility. The summary supports rich content and
         * can contain any component. This can be utilized, for example, to display the status of the corresponding
         * content.
         *
         * @see
         *   <a href="https://github.com/vaadin/web-components/tree/21.0/packages/vaadin-accordion">Component
         *   Documentation</a>
         */
        def summary(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := "summary"))

      }

      /**
       * Accordion panels can be disabled to prevent them from being expanded or collapsed. Details can be disabled to
       * prevent them from being expanded or collapsed. Components inside a disabled expanded panel are automatically
       * disabled as well.
       *
       * @see
       *   <a href="https://github.com/vaadin/web-components/tree/21.0/packages/vaadin-accordion">Component
       *   Documentation</a>
       */
      val `disabled` = new ReactiveProp("disabled", BooleanAsIsCodec)

      object styles {
        import com.raquo.domtypes.generic.keys.Style

      }

      def apply(mods: ModFunction*): El =
        tag(mods.map(_(AccordionPanel)): _*)

    }

  }

  /**
   * vaadin-app-layout
   *
   * App Layout is a component for building common application layouts.
   *
   * {@literal @vaadin/vaadin-app-layout@21.0.2}
   *
   * @see
   *   <a href="https://github.com/vaadin/web-components/tree/21.0/packages/vaadin-app-layout">Component
   *   Documentation</a>
   */
  object AppLayout {

    @js.native
    trait RawElement extends js.Object {

      /**
       * Controls whether the drawer is opened (visible) or not. Its default value depends on the viewport:
       *
       * true, for desktop size views false, for mobile size views
       *
       * @see
       *   <a href="https://github.com/vaadin/web-components/tree/21.0/packages/vaadin-app-layout">Component
       *   Documentation</a>
       */
      def `drawerOpened`: Boolean

      /**
       * Drawer is an overlay on top of the content Controlled via CSS using --vaadin-app-layout-drawer-overlay:
       * true|false.
       *
       * @see
       *   <a href="https://github.com/vaadin/web-components/tree/21.0/packages/vaadin-app-layout">Component
       *   Documentation</a>
       */
      def `overlay`: Boolean

      /**
       * Defines whether navbar or drawer will come first visually. By default (primary-section="navbar"), the navbar
       * takes the full available width and moves the drawer down. If primary-section="drawer" is set, then the drawer
       * will move the navbar, taking the full available height.
       *
       * @see
       *   <a href="https://github.com/vaadin/web-components/tree/21.0/packages/vaadin-app-layout">Component
       *   Documentation</a>
       */
      def `primary-section`: Any

    }

    @js.native
    @JSImport("@vaadin/vaadin-app-layout/vaadin-app-layout", JSImport.Default)
    object RawImport extends js.Object {}
    RawImport // needed because objects are lazy

    type Ref         = dom.html.Element with RawElement
    type El          = ReactiveHtmlElement[Ref]
    type ModFunction = AppLayout.type => Mod[El]

    private val tag = new HtmlTag[Ref]("vaadin-app-layout", void = false)

    object slots {

      /**
       * Default container for the page content
       *
       * @see
       *   <a href="https://github.com/vaadin/web-components/tree/21.0/packages/vaadin-app-layout">Component
       *   Documentation</a>
       */
      def default(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := ""))

      /**
       * Container for the top navbar area
       *
       * @see
       *   <a href="https://github.com/vaadin/web-components/tree/21.0/packages/vaadin-app-layout">Component
       *   Documentation</a>
       */
      def navbar(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := "navbar"))

      /**
       * Container for an application menu
       *
       * @see
       *   <a href="https://github.com/vaadin/web-components/tree/21.0/packages/vaadin-app-layout">Component
       *   Documentation</a>
       */
      def drawer(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := "drawer"))

      /**
       * Container for the bottom navbar area (only visible for mobile devices)
       *
       * @see
       *   <a href="https://github.com/vaadin/web-components/tree/21.0/packages/vaadin-app-layout">Component
       *   Documentation</a>
       */
      def touchOptimized(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := "touch-optimized"))

    }

    /**
     * Controls whether the drawer is opened (visible) or not. Its default value depends on the viewport:
     *
     * true, for desktop size views false, for mobile size views
     *
     * @see
     *   <a href="https://github.com/vaadin/web-components/tree/21.0/packages/vaadin-app-layout">Component
     *   Documentation</a>
     */
    val `drawerOpened` = new ReactiveProp("drawerOpened", BooleanAsIsCodec)

    /**
     * Drawer is an overlay on top of the content Controlled via CSS using --vaadin-app-layout-drawer-overlay:
     * true|false.
     *
     * @see
     *   <a href="https://github.com/vaadin/web-components/tree/21.0/packages/vaadin-app-layout">Component
     *   Documentation</a>
     */
    val `overlay` = new ReactiveProp("overlay", BooleanAsIsCodec)

    object styles {
      import com.raquo.domtypes.generic.keys.Style

    }

    def apply(mods: ModFunction*): El =
      tag(mods.map(_(AppLayout)): _*)

    /**
     * vaadin-drawer-toggle
     *
     * Show and hide the drawer using a Drawer Toggle (or a Button). The Drawer Toggle (☰) should always be accessible
     * (unless the drawer is empty) and is most often situated in the navbar.
     *
     * {@literal @vaadin/vaadin-app-layout@21.0.2}
     *
     * @see
     *   <a href="https://github.com/vaadin/web-components/tree/21.0/packages/vaadin-app-layout">Component
     *   Documentation</a>
     */
    object DrawerToggle {

      @js.native
      trait RawElement extends js.Object {}

      @js.native
      @JSImport("@vaadin/vaadin-app-layout/vaadin-drawer-toggle", JSImport.Default)
      object RawImport extends js.Object {}
      RawImport // needed because objects are lazy

      type Ref         = dom.html.Element with RawElement
      type El          = ReactiveHtmlElement[Ref]
      type ModFunction = DrawerToggle.type => Mod[El]

      private val tag = new HtmlTag[Ref]("vaadin-drawer-toggle", void = false)

      object slots {}

      object styles {
        import com.raquo.domtypes.generic.keys.Style

      }

      def apply(mods: ModFunction*): El =
        tag(mods.map(_(DrawerToggle)): _*)

    }

  }

  /**
   * vaadin-avatar
   *
   * Avatar is a graphical representation of an object or entity, for example a person or an organization.
   *
   * {@literal @vaadin/vaadin-avatar@21.0.2}
   *
   * @see
   *   <a href="https://github.com/vaadin/web-components/tree/21.0/packages/vaadin-avatar">Component Documentation</a>
   */
  object Avatar {

    @js.native
    trait RawElement extends js.Object {

      /**
       * The name is shown on hover in a tooltip. When a name is set, Avatar will auto-generate and display an
       * abbreviation of the specified name. For example, “Allison Torres” becomes “AT”, “John Smith” becomes “JS”, etc.
       *
       * @see
       *   <a href="https://github.com/vaadin/web-components/tree/21.0/packages/vaadin-avatar">Component
       *   Documentation</a>
       */
      def `name`: String

      /**
       * The abbreviation can also be set manually. Abbreviations should be kept to a maximum of 2–3 characters.
       *
       * @see
       *   <a href="https://github.com/vaadin/web-components/tree/21.0/packages/vaadin-avatar">Component
       *   Documentation</a>
       */
      def `abbr`: String

      /**
       * Avatar can be used to display images, such as user profile pictures or company logos. Abbreviations are not
       * shown when images are used.
       *
       * @see
       *   <a href="https://github.com/vaadin/web-components/tree/21.0/packages/vaadin-avatar">Component
       *   Documentation</a>
       */
      def `img`: String

      /**
       * Avatar has four size variants available: xlarge|large|small|xsmall.
       *
       * @see
       *   <a href="https://github.com/vaadin/web-components/tree/21.0/packages/vaadin-avatar">Component
       *   Documentation</a>
       */
      def `theme`: String

      /**
       * By default, there are 7 different background colors you can use for Avatar. The background color is set using a
       * color index.
       *
       * @see
       *   <a href="https://github.com/vaadin/web-components/tree/21.0/packages/vaadin-avatar">Component
       *   Documentation</a>
       */
      def `color-index`: String

    }

    @js.native
    @JSImport("@vaadin/vaadin-avatar/vaadin-avatar", JSImport.Default)
    object RawImport extends js.Object {}
    RawImport // needed because objects are lazy

    type Ref         = dom.html.Element with RawElement
    type El          = ReactiveHtmlElement[Ref]
    type ModFunction = Avatar.type => Mod[El]

    private val tag = new HtmlTag[Ref]("vaadin-avatar", void = false)

    object slots {}

    /**
     * The name is shown on hover in a tooltip. When a name is set, Avatar will auto-generate and display an
     * abbreviation of the specified name. For example, “Allison Torres” becomes “AT”, “John Smith” becomes “JS”, etc.
     *
     * @see
     *   <a href="https://github.com/vaadin/web-components/tree/21.0/packages/vaadin-avatar">Component Documentation</a>
     */
    val `name` = new ReactiveProp("name", StringAsIsCodec)

    /**
     * The abbreviation can also be set manually. Abbreviations should be kept to a maximum of 2–3 characters.
     *
     * @see
     *   <a href="https://github.com/vaadin/web-components/tree/21.0/packages/vaadin-avatar">Component Documentation</a>
     */
    val `abbr` = new ReactiveProp("abbr", StringAsIsCodec)

    /**
     * Avatar can be used to display images, such as user profile pictures or company logos. Abbreviations are not shown
     * when images are used.
     *
     * @see
     *   <a href="https://github.com/vaadin/web-components/tree/21.0/packages/vaadin-avatar">Component Documentation</a>
     */
    val `img` = new ReactiveProp("img", StringAsIsCodec)

    /**
     * Avatar has four size variants available: xlarge|large|small|xsmall.
     *
     * @see
     *   <a href="https://github.com/vaadin/web-components/tree/21.0/packages/vaadin-avatar">Component Documentation</a>
     */
    val `theme` = new ReactiveProp("theme", StringAsIsCodec)

    /**
     * By default, there are 7 different background colors you can use for Avatar. The background color is set using a
     * color index.
     *
     * @see
     *   <a href="https://github.com/vaadin/web-components/tree/21.0/packages/vaadin-avatar">Component Documentation</a>
     */
    val `color-index` = new ReactiveProp("color-index", StringAsIsCodec)

    object styles {
      import com.raquo.domtypes.generic.keys.Style

    }

    def apply(mods: ModFunction*): El =
      tag(mods.map(_(Avatar)): _*)

  }

}

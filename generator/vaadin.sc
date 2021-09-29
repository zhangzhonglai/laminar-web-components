/**
 * Web Component definitions for Google's Material Web Components
 */

import $file.definition

import definition._

val componentCollection = WebComponentCollection(
  packageName = "vaddin",
  link = "https://github.com/vaadin/web-components/tree/21.0/packages/vaadin-accordion",
  globalCssProperties = Seq(),
  components = Seq(
    WebComponent(
      tag = "vaadin-accordion",
      description =
        "Accordion is a vertically stacked set of expandable panels. It reduces clutter and helps maintain the user’s focus by showing only the relevant content at a time.",
      link = "https://github.com/vaadin/web-components/tree/21.0/packages/vaadin-accordion",
      npmPackage = NpmPackage(name = "@vaadin/vaadin-accordion", version = "21.0.2"),
      jsImport = "@vaadin/vaadin-accordion",
      subComponents = Seq(
        WebComponent(
          tag = "vaadin-accordion-panel",
          description =
            "<vaadin-accordion> is a Web Component implementing the vertically stacked set of expandable panels, part of the Vaadin components.",
          link = "https://github.com/vaadin/web-components/tree/21.0/packages/vaadin-accordion",
          npmPackage = NpmPackage(name = "@vaadin/vaadin-accordion", version = "21.0.2"),
          jsImport = "@vaadin/vaadin-accordion/vaadin-accordion-panel",
          slots = Slots(
            default = Some(
              DefaultSlot(
                "This is the collapsible part of a panel. It can contain any component. When the content area is collapsed, the content is invisible and inaccessible by keyboard or screen reader."
              )
            ),
            named = Seq(
              NamedSlot(
                name = "summary",
                description =
                  "The summary is the part that is always visible, and typically describes the contents, for example, with a title. Clicking on the summary toggles the content area’s visibility. The summary supports rich content and can contain any component. This can be utilized, for example, to display the status of the corresponding content."
              )
            )
          ),
          properties = Seq(
            Property(
              name = "theme",
              tpe = WebComponentFieldType.Any,
              description =
                "Accordion has three theme variants: filled, small and reverse. Set the theme attribute separately for each panel, not on Accordion itself. Theme names can be combined with each other, for example, all three themes filled, small, and reverse can be applied to a panel."
            ),
            Property(
              name = "disabled",
              tpe = WebComponentFieldType.Boolean,
              description =
                "Accordion panels can be disabled to prevent them from being expanded or collapsed. Details can be disabled to prevent them from being expanded or collapsed. Components inside a disabled expanded panel are automatically disabled as well."
            )
          )
        )
      )
    ),

    WebComponent(
      tag = "vaadin-app-layout",
      description = "App Layout is a component for building common application layouts.",
      link = "https://github.com/vaadin/web-components/tree/21.0/packages/vaadin-app-layout",
      npmPackage = NpmPackage(name = "@vaadin/vaadin-app-layout", version = "21.0.2"),
      jsImport = "@vaadin/vaadin-app-layout/vaadin-app-layout",
      slots = Slots(
        default = Some(
          DefaultSlot(
            "Default container for the page content"
          )
        ),
        named = Seq(
          NamedSlot(
            name = "navbar",
            description = "Container for the top navbar area"
          ),
          NamedSlot(
            name = "drawer",
            description = "Container for an application menu"
          ),
          NamedSlot(
            name = "touch-optimized",
            description = "Container for the bottom navbar area (only visible for mobile devices)"
          )
        )
      ),
      properties = Seq(
        Property(
          name = "drawerOpened",
          tpe = WebComponentFieldType.Boolean,
          description =
            "Controls whether the drawer is opened (visible) or not. Its default value depends on the viewport:\n\ntrue, for desktop size views\nfalse, for mobile size views"
        ),
        Property(
          name = "overlay",
          tpe = WebComponentFieldType.Boolean,
          description =
            "Drawer is an overlay on top of the content Controlled via CSS using --vaadin-app-layout-drawer-overlay: true|false."
        ),
        Property(
          name = "primary-section",
          tpe = WebComponentFieldType.Any,
          description =
            "Defines whether navbar or drawer will come first visually.\nBy default (primary-section=\"navbar\"), the navbar takes the full available width and moves the drawer down.\nIf primary-section=\"drawer\" is set, then the drawer will move the navbar, taking the full available height."
        )
      ),
      subComponents = Seq(
        WebComponent(
          tag = "vaadin-drawer-toggle",
          description =
            "Show and hide the drawer using a Drawer Toggle (or a Button). The Drawer Toggle (☰) should always be accessible (unless the drawer is empty) and is most often situated in the navbar.",
          link = "https://github.com/vaadin/web-components/tree/21.0/packages/vaadin-app-layout",
          npmPackage = NpmPackage(name = "@vaadin/vaadin-app-layout", version = "21.0.2"),
          jsImport = "@vaadin/vaadin-app-layout/vaadin-drawer-toggle"
        )
      )
    ),

    WebComponent(
      tag = "vaadin-avatar",
      description = "Avatar is a graphical representation of an object or entity, for example a person or an organization.",
      link = "https://github.com/vaadin/web-components/tree/21.0/packages/vaadin-avatar",
      npmPackage = NpmPackage(name = "@vaadin/vaadin-avatar", version = "21.0.2"),
      jsImport = "@vaadin/vaadin-avatar/vaadin-avatar",
      properties = Seq(
        Property(
          name = "name",
          tpe = WebComponentFieldType.String,
          description =
            "The name is shown on hover in a tooltip. When a name is set, Avatar will auto-generate and display an abbreviation of the specified name. For example, “Allison Torres” becomes “AT”, “John Smith” becomes “JS”, etc."
        ),
        Property(
          name = "abbr",
          tpe = WebComponentFieldType.String,
          description =
            "The abbreviation can also be set manually. Abbreviations should be kept to a maximum of 2–3 characters."
        ),
        Property(
          name = "img",
          tpe = WebComponentFieldType.String,
          description =
            "Avatar can be used to display images, such as user profile pictures or company logos. Abbreviations are not shown when images are used."
        ),
        Property(
          name = "theme",
          tpe = WebComponentFieldType.String,
          description =
            "Avatar has four size variants available: xlarge|large|small|xsmall."
        ),
        Property(
          name = "color-index",
          tpe = WebComponentFieldType.String,
          description =
            "By default, there are 7 different background colors you can use for Avatar. The background color is set using a color index."
        )
      )
    ),
    
  )
)

<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fn="http://www.w3.org/2005/xpath-functions" xmlns:xsd="http://www.w3.org/2001/XMLSchema">

        
        
       <xsl:template match="xsd:element[@name]">
      
         
        <xsl:value-of select="substring(@name,1,1)"></xsl:value-of> 
         
        <xsl:if test="fn:matches(@name, '[A-Z]')">
        
          <xsl:text>TEXT</xsl:text>
        </xsl:if>
       <!-- 
         <xsl:if test="fn:matches(fn:substring(@name,0,1),'j')">
            <xsl:text>TEXT</xsl:text>
                   
         </xsl:if>
          -->

    </xsl:template>

</xsl:stylesheet>
<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template match="/">
        <html>
            <body>
                <h2>Relevé de compte</h2>
                <table border="1">
                    <tr bgcolor="#9acd32">
                        <th>Type</th>
                        <th>Date</th>
                        <th>Montant</th>
                        <th>Description</th>
                    </tr>
                    <xsl:for-each select="releve/operations/operation">
                        <tr>
                            <td><xsl:value-of select="@type"/></td>
                            <td><xsl:value-of select="@date"/></td>
                            <td><xsl:value-of select="@montant"/></td>
                            <td><xsl:value-of select="@description"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
                <p>Total Débits: <xsl:value-of select="sum(releve/operations/operation[@type='DEBIT']/@montant)"/></p>
                <p>Total Crédits: <xsl:value-of select="sum(releve/operations/operation[@type='CREDIT']/@montant)"/></p>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>

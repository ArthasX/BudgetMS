Ext.onReady(function(){
var s= Ext.create('Ext.container.Viewport', {
    layout: 'border',
    items: [{
        region: 'north',
        html: '<h1 class="x-panel-header">预算管理</h1>',
        border: false,
        margins: '0 0 5 0'
    }, {
        region: 'west',
        collapsible: true,
        title: 'Navigation',
        width: 150
        // could use a TreePanel or AccordionLayout for navigational items
    }, {
        region: 'east',
        title: 'South Panel',
        collapsible: true,
        collapsed:true,
        split: true,
        width: 450
    }, {
        region: 'east',
        title: '新增',
        collapsible: true,
        collapsed:true,
        split: true,
        width: 450
    }, {
        region: 'center',
        xtype: 'tabpanel', // TabPanel itself has no title
        activeTab: 0,      // First tab active by default
        items: {
            title: 'Default Tab',
            html: 'The first tab\'s content. Others may be added dynamically'
        }
    }]
	 
});
});
var PAGE_SIZE = 25;

function genDH() {
	var date = new Date();
	var yyyy = date.getFullYear().toString();
	var MM = (date.getMonth() + 1).toString();
	var DD = date.getDate().toString();
	var hh = date.getHours().toString();
	var mm = date.getMinutes().toString();
	var ss = date.getSeconds().toString();
	return yyyy + cl(MM) + cl(DD) + cl(hh) + cl(mm) + cl(ss);
}
function cl(s) {
	if (s.length < 2)
		s = "0" + s;
	return s;
}
function genInstId() {
	return 'QSBH' + genDH();
}
function genContId() {
	return 'HTBH' + genDH();
}
function genInvoId() {

}

Ext.application({
	requires : [ 'Ext.container.Viewport' ],
	name : 'BudgetMS',
	appFolder : 'app',
	controllers : [ 'instCtrl', 'treeCtrl' ],
	launch : function() {
		var s = Ext.create('Ext.container.Viewport', {
			layout : 'border',
			items : [ {
				region : 'north',
				html : '<h1 class="x-panel-header">预算管理</h1>',
				border : false,
				margins : '0 0 5 0'
			}, {
				region : 'west',
				collapsible : true,
				title : '菜單',
				width : 150,
				items : {
					text : '菜单',
					xtype : 'treeMenu',
					layout : 'fit'
				}
			// could use a TreePanel or AccordionLayout for navigational items
			}, /*
				 * { region : 'east', title : 'South Panel', collapsible : true,
				 * collapsed : true, split : true, width : 450 },
				 */
			{
				region : 'east',
				title : '新增',
				collapsible : true,
				collapsed : true,
				split : true,
				width : 450
			}, {
				region : 'center',
				xtype : 'tabpanel', // TabPanel itself has no title
				activeTab : 1, // First tab active by default
				items : [ {
					title : '请示',
					xtype : 'instList',
					closable : true,
					autoDestroy : false,
					closeAction : 'hide',
					collapsible : false
				}, {
					title : '123'
				} ]
			} ]

		});

	}
})